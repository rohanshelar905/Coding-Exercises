package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {

	Connection con;
	public ConnectionTest()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","seed1234");
			System.out.println("Connected Successfully.....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ConnectionTest();

	}

}
