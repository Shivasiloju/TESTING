package jdbc;

import java.sql.*;

public class updatetable {
 public static void main(String[] args) throws SQLException,ClassNotFoundException{
	 Statement ss;
	Connection cc;

	Class.forName("com.mysql.cj.jdbc.Driver");
	
	
	cc=DriverManager.getConnection("jdbc:mysql://localhost/shiva","root","shiva@2000");

	ss=cc.createStatement();
	
	ss.execute("update mobiles set mname='chinna',id=2 where id=1 ");   
		System.out.println("updated mobiles table");
		
		ss.execute("delete from mobiles where id=2 ");
		
			
			ss.close();
			cc.close();
}
}
