package JDBC;

import java.sql.*;
 
public class JDBC_Example {
 
public static void main(String[] args)
{
	
try {
	
Class.forName("com.mysql.cj.jdbc.Driver"); 
	   
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "J@mmy2810");
 
Statement stmt=con.createStatement();
 
ResultSet rs=stmt.executeQuery(" select * from Employee");
 
while (rs.next())
{
	System.out.println(rs.getInt("Employee_ID") + " " + rs.getString("First_Name"));
}
con.close();
}
	catch (Exception e)
   {
		System.out.println(e);
   }
}
 
}
 


