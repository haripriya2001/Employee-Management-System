package emp_project.dao;
import emp_project.db.*;
import java.sql.*;
public class AddUser_dao {
	
	public static boolean insertUser(String Emp_Id,String f_Name,String l_Name,String DOB,String email_Id,String Dept_Id)
	{
		int emp_Id=Integer.parseInt(Emp_Id);
		int dept_Id=Integer.parseInt(Dept_Id);
		
		try
		{
	            PreparedStatement statement=Login_db.getPreparedStatement("insert into employee values(?,?,?,?,?,?)");
		    statement.setInt(1, emp_Id);
		    statement.setString(2, f_Name);
		    statement.setString(3, l_Name);
		    statement.setString(4, DOB);
		    statement.setString(5,email_Id);
		    statement.setInt(6, dept_Id);
		    int count=statement.executeUpdate();
		    System.out.println(count+" row/s affected");
		    return true;
                }catch(Exception e)
		{
        	e.printStackTrace();	
		}
		return false;
	  }
	 public static boolean set_UserId_PassWord(String userId, String PassWord,String role)
	 {
		int user_Id=Integer.parseInt(userId);
		try{
			PreparedStatement statement =Login_db.getPreparedStatement("insert into login values(?,?,?)");
			statement.setInt(1, user_Id);
			statement.setString(2, PassWord);
			statement.setString(3, role);
			int count=statement.executeUpdate();
			System.out.println(count+ " row/s affected");
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	return false;	
	}
}


