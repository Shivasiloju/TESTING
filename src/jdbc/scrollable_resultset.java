package jdbc;

import java.sql.*;

public class scrollable_resultset {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
//		Connection con;
		java.sql.Statement st;
		ResultSet rs;
		 Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded and registered");
			
			Connection AC=DriverManager.getConnection("jdbc:mysql://localhost/shiva","root","shiva@2000");
			System.out.println("connection established");
			
			st=AC.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=st.executeQuery("select * from dept");
			
			rs.next();
			int a=rs.getInt(1);
			String b=rs.getString(2);
			System.out.println(a);
			System.out.println(b);
			
			
			rs.absolute(9);
			int c=rs.getInt(1);
			String d=rs.getString(2);
			System.out.println(c);
			System.out.println(d);
			
			rs.previous();
			int f=rs.getInt(1);
			String e=rs.getString(2);
			System.out.println(f);
			System.out.println(e);
			
			rs.last();
			int g=rs.getInt(1);
			String h=rs.getString(2);
			System.out.println(g);
			System.out.println(h);
			
			rs.first();
			int i=rs.getInt(1);
			String z=rs.getString(2);
			System.out.println(i);
			System.out.println(z);
			 
			rs.close();
			st.close();
			AC.close();
	}

}
