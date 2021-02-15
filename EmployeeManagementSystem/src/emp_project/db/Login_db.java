package emp_project.db;
import java.sql.*;

public class Login_db 
{
	

	public static  PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException,SQLException
	{
		
			String url="jdbc:mysql://localhost:3306/EMS";
			String user="root";
			String pass="admin";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,pass);
			PreparedStatement ps=con.prepareStatement(sql);
			System.out.println("connection succeed");
			return ps;
		
	}
}
		



