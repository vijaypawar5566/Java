import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class sql_qry {
	
	private static Connection con;
	
	static {
		
		try {
			con = Getconnection.gconnection();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		public ArrayList<Student_t> getallstudent() throws SQLException {
			ArrayList<Student_t> allstud = new ArrayList<Student_t>();
			
			Statement stmt = con.createStatement();
			ResultSet rset=stmt.executeQuery("select * from student");
			
			
			while(rset.next()) {
				
				Student_t st = new Student_t(rset.getInt(1),rset.getString(2),rset.getString(3),rset.getString(4));
				
			}
			
			
			
			
			
			
			
			
			
		}
		
	}
	

}
