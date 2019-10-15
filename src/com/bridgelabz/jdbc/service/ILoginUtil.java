package com.bridgelabz.jdbc.service;

import java.sql.SQLException;


import com.bridgelabz.jdbc.model.Student;

public interface ILoginUtil {
	public Student checkUser(int id, String name) throws SQLException;

	public int registerUser(Student student) throws SQLException;
}
