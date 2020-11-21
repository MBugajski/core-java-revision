package com.MBugajski.jdbc;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCApplication {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
		try {
			//Establish connection
			java.sql.Connection conn = DriverManager.getConnection(url, "root", "password123");
			
			//create a statement object to send to the database
			Statement statement = conn.createStatement();
			
			//Execute statement
			ResultSet resultSet = statement.executeQuery("select * from employees_tbl");
			
			//Process the result
			int salaryTotal = 0;
			while(resultSet.next()) {
				System.out.println(resultSet.getString("name") + " has salary of " +resultSet.getString("salary"));
				salaryTotal = salaryTotal + Integer.parseInt(resultSet.getString("salary"));
			}
			System.out.println("Total salary payments equal " + salaryTotal);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
