package com.bridgelabz.jdbc.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.bridgelabz.jdbc.model.Student;
import com.bridgelabz.jdbc.repo.DbConnection;
import com.mysql.jdbc.PreparedStatement;

public class ImplLoginUtil implements ILoginUtil 
{
	static Connection connection = DbConnection.getConnection();
	static PreparedStatement preparedStatement = null;

	@Override
	public Student checkUser(int id, String name) throws SQLException {
		Student student = new Student();
		String query = "select * from student where id=? and name=?";
		preparedStatement = (PreparedStatement) connection.prepareStatement(query);
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);

		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) 
		{
			student.setId(resultSet.getInt(1));
			student.setName(resultSet.getString(2));
			student.setAddress(resultSet.getString(3));
		}

		return student;
	}

	@Override
	public int registerUser(Student student) throws SQLException 
	{
		
		String query = "insert into student values(?,?,?)";
		preparedStatement = (PreparedStatement) connection.prepareStatement(query);
		preparedStatement.setInt(1, student.getId());
		preparedStatement.setString(2, student.getName());
		preparedStatement.setString(3, student.getAddress());

		return preparedStatement.executeUpdate();
	}

}
