package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataReadTable {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","seed1234");
			System.out.println("connected....");
			
			Statement stat=con.createStatement();
			ResultSet res=stat.executeQuery("select * from employees");
			
			System.out.println("Employee_Id   First_Name  Last_Name   Salary    Department_ID");
			System.out.println("------------------------------------------------------------------");
			while(res.next()){
				System.out.println(res.getInt(1)+"      "
										+res.getString(2)+"      "
										+res.getString(3)+"       "
										+res.getInt("salary")+"      "
										+res.getInt("department_id"));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
