package jdbc;

import java.sql.*;



public class execute_query {
	public static void main(String[] args) throws Exception{
		Statement ss;
		Connection cc;
        ResultSet rd;
        
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded and registered");
		
		cc=DriverManager.getConnection("jdbc:mysql://localhost/shiva","root","shiva@2000");
		System.out.println("connection established");
		
		ss=cc.createStatement();
		
		rd=ss.executeQuery("select deptno,dname from dept");
		
		rd.next();
		int id=rd.getInt(1);
		
		String dname=rd.getString(2);
		
		System.out.println("deptno:" + id + "\n" + "dname :" + dname);
		
		ss.close();
		cc.close();
		rd.close();
	}
}