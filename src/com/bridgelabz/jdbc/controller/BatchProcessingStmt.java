/******************************************************************************
 *  Purpose: Program is written for doing batch processing operation of 

             database using addBatch(), executeBatch() method using 
 *  		 statement
 *
 *  @author   swapna khairnar
 *  @since   14-10-2019
 ******************************************************************************/

package com.bridgelabz.jdbc.controller;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;

import com.bridgelabz.jdbc.repo.DbConnection;
public class BatchProcessingStmt 
{
	private static Connection connection = null;
	private static Statement statement = null;

	public static void main(String[] args) throws SQLException 
	{
		System.out.println("Performing batch processing for inserting records in database");
		int[] arr = executeAllQuery();
		System.out.println("Status of all query");
		for (int a : arr) 
		{
			System.out.print(a + " ");
		}
	}

	private static int[] executeAllQuery() throws SQLException 
	{
		String delete = "DELETE FROM student";
		String query1 = "INSERT INTO student VALUES(1,'swati','dhule')";
		String query2 = "INSERT INTO student VALUES(2,'ashwini','pune')";
		String query3 = "INSERT INTO student VALUES(3,'puja','nagar')";
		String query4 = "INSERT INTO student VALUES(4,'priyu','shirur')";
		String query5 = "INSERT INTO student VALUES(5,'leena','thane')";
	 
		connection = DbConnection.getConnection();

		statement = connection.createStatement();
		statement.addBatch(delete);
		statement.addBatch(query1);
		statement.addBatch(query2);
		statement.addBatch(query3);
		statement.addBatch(query4);
		statement.addBatch(query5);
	 
		
		return statement.executeBatch();
	}

}
