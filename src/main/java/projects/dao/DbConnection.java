package projects.dao;

//Create a class in the projects.dao package named DbConnection
//Create the following constants: HOST, PASSWORD, PORT, SCHEMA, and USER
//Set the constants to the correct values
//create a method named getConnection()
// 	a.	Create a String variable named uri that contains the MySQL connection URI.
//	b.  Call DriverManager to obtain a connection. Pass the connection string (URI) to DriverManager.getConnection().
//	c.  Surround the call to DriverManager.getConnection() with a try/catch block. The catch block should catch SQLException.
//	d.  Print a message to the console (System.out.println) if the connection is successful.
//	e.  Print an error message to the console if the connection fails. Throw a DbException if the connection fails.


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbException;

public class DbConnection {
	private static final String SCHEMA = "projects";
	private static final String USER = "projects";
	private static final String PASSWORD = "projects";
	private static final String HOST = "localhost";
	private static final int PORT = 3306;
	
	
	public static Connection getConnection() {
		String uri = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false", HOST, PORT, SCHEMA, USER, PASSWORD);
	

System.out.println("Connecting with url=" + uri);

try {
	Connection conn = DriverManager.getConnection(uri);
	System.out.println("Successfully obtained connection!");
	return conn;
} catch (SQLException e) {
	throw new DbException(e);
	}
	
}
}

