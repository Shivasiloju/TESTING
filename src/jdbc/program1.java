package jdbc;

import java.sql.*;

public class program1 {
	
public static void main(String[] args) throws SQLException, ClassNotFoundException
{
	Statement ss;
	Connection cc;

	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("driver loaded and registered");
	
	cc=DriverManager.getConnection("jdbc:mysql://localhost/shiva","root","shiva@2000");
	System.out.println("connection established");
	
	ss=cc.createStatement();
	
	ss.execute("insert into mobiles values(1,'shiva')");
	System.out.println("data inserted");
	ss.close();
	cc.close();
	
	
}
}
