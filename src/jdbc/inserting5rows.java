package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class inserting5rows {
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		Statement ss;
		Connection cc;

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded and registered");
		
		cc=DriverManager.getConnection("jdbc:mysql://localhost/shiva","root","shiva@2000");
		System.out.println("connection established");
		
		ss=cc.createStatement();
		
		ss.execute("insert into dept values(1,'shiva')");
		ss.execute("insert into dept values(2,'hanoku')");
		ss.execute("insert into dept values(3,'supriya')");
		ss.execute("insert into dept values(4,'mani')");
		ss.execute("insert into dept values(5,'shashi')");
		
		System.out.println("data inserted");
		ss.close();
		cc.close();
	}
}
