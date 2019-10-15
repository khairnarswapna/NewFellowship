package com.bridgelabz.jdbc.repo;


import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	static String url = "jdbc:mysql://localhost:3306/database?verifyServerCertificate=false&useSSL=true";
	static String username ="root";
	static String password ="admin@123";
	static Connection connection = null;

	public static Connection getConnection() 
	{

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;

	}

}
