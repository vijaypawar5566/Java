import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Getconnection {
	
	public static Connection gconnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		System.out.println("------------Driver Loaded -------------------");
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "system";
		String pass = "vijay";
		
		
		Connection con = DriverManager.getConnection(url, username, pass);
		System.out.println("-------------Connection Established-----------------");
		return con;
		
		
		
		
		
		
		
		
	}

}
