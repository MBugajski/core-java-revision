package com.MBugajski.jdbc;

import java.sql.Statement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCApplication {
	public static void main(String[] args) {

		String url = "jdbc:mysql://127.0.0.1:3306/employees_database?serverTimezone=Europe/Amsterdam";
		int rowsAffected;
		try {
			// Establish connection
			java.sql.Connection conn = DriverManager.getConnection(url, "root", "password123");

			// create a statement object to send to the database
			Statement statement = conn.createStatement();

			// Execute statements
			rowsAffected = statement.executeUpdate(
					"INSERT INTO employees_tbl(id, name, dept, salary) values (800, 'Juliet', 'Sales', 5500)");

			System.out.println("Executed an Insert statement = Rows Affected: " + rowsAffected);
			
			rowsAffected = statement.executeUpdate("DELETE FROM employees_tbl WHERE id = 800");

			System.out.println("Executed a Delete statement = Rows Affected: " + rowsAffected);

			rowsAffected = statement.executeUpdate("UPDATE employees_tbl SET salary = 5900 WHERE id = 700");
			
			System.out.println("Executed an Update statement = Rows Affected: " + rowsAffected);

			ResultSet resultSet = statement.executeQuery("SELECT * from employees_tbl");

			// Process the result
			int salaryTotal = 0;
			while (resultSet.next()) {
				System.out.println(resultSet.getString("name") + " has salary of " + resultSet.getString("salary"));
				salaryTotal = salaryTotal + Integer.parseInt(resultSet.getString("salary"));
			}
			System.out.println("Total salary payments equal " + salaryTotal);

		} catch (SQLException e) {
			System.err.println("Error while Insertion: " + e);
		}
	}
}
