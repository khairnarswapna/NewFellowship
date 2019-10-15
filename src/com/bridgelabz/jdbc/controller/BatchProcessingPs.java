/******************************************************************************
 *  Purpose: Program is written for doing batch processing operation of 

             database using addBatch(), executeBatch() method using 
 *  		 statement
 * @author :swapna khairnar
 *
 ******************************************************************************/
package com.bridgelabz.jdbc.controller;

import java.sql.Connection;


import java.sql.SQLException;

import com.bridgelabz.jdbc.repo.DbConnection;
import com.mysql.jdbc.PreparedStatement;

public class BatchProcessingPs 
{
	private static Connection connection = null;
	private static PreparedStatement preparedStatement = null;

	public static void main(String[] args) throws SQLException 
	{
		System.out.println("inserting records in database");
		int[] arr = executeAllQuery();
		System.out.println("Status of all query");
		for (int a : arr) 
		{
			System.out.print(a + " ");
		}
	}

	private static int[] executeAllQuery() throws SQLException 
	{
		//String delete = "DELETE FROM student";
		String query1 = "INSERT INTO student VALUES(?,?,?)";
		connection = DbConnection.getConnection();

//		preparedStatement = (PreparedStatement) connection.prepareStatement(delete);
//		preparedStatement.addBatch(delete);
		preparedStatement = (PreparedStatement) connection.prepareStatement(query1);
		preparedStatement.setInt(1, 1);
		preparedStatement.setString(2, "swati");
		preparedStatement.setString(3, "dhule");
		preparedStatement.addBatch();

		preparedStatement.setInt(1, 2);
		preparedStatement.setString(2, "ashwini");
		preparedStatement.setString(3, "pune");
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 3);
		preparedStatement.setString(2, "puja");
		preparedStatement.setString(3, "nagar");
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 4);
		preparedStatement.setString(2, "priyu");
		preparedStatement.setString(3, "shirur");
		preparedStatement.addBatch();
		
		preparedStatement.setInt(1, 5);
		preparedStatement.setString(2, "leena");
		preparedStatement.setString(3, "thane");
		preparedStatement.addBatch();
		
		return preparedStatement.executeBatch();
	}

}
