package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataRead {
	Connection con;
	Statement st;
	ResultSet rs;
	
	public DataRead()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","seed1234");
			System.out.println("Database connected successfully....");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void getData()
	{
		try {
			st=con.createStatement();
			rs=st.executeQuery("select * from employees");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void printData()
	{
		try {
			while(rs.next())
			{
				System.out.println(rs.getInt("employee_id"));
				System.out.println(rs.getString("first_name"));
				System.out.println(rs.getString("last_name"));
				System.out.println(rs.getInt("salary"));
				System.out.println(rs.getInt("department_id"));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		DataRead dr=new DataRead();
		dr.getData();
		dr.printData();
	}

}
