package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","root");
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate("insert into eproduct(name,price,date_added)values('TV',26000.00,now())");
		stmt.executeQuery("select * from eproduct");
		ResultSet res = stmt.executeQuery("select * from eproduct");
		while(res.next()) {
			System.out.println("Product ID : " + res.getInt("id"));
			System.out.println("Product Name : "+ res.getString("name"));
		}
con.close();
	}

}
