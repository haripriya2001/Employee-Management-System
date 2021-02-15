package emp_project.dao;
import emp_project.bean.*;
import emp_project.db.*;
import java.sql.*;

public class Login_dao 
{
	public static String authenticateLoginUser(Login_bean loginbean)
	{
		String user_Id =loginbean.getUserId();
		String passWord=loginbean.getPassWord();
		int userId=0;
		userId=Integer.parseInt(user_Id);
		int userIdDB;
		String passWordDB="";
		String roleDB="";
		try
		{
			PreparedStatement statement=Login_db.getPreparedStatement("select * from login");
			ResultSet resultset=statement.executeQuery();
		    while(resultset.next())
		    {
		    	userIdDB=resultset.getInt(1);
		    	passWordDB=resultset.getString(2);
		    	roleDB=resultset.getString(3);
		    	if(userIdDB==userId && passWordDB.equals(passWord) && roleDB.equals("employee"))
		    	{
		    		return "employee";
		    	}
		    	else if(userIdDB==userId && passWordDB.equals(passWord) && roleDB.equals("admin"))
		    	{ 
		    		return "admin";
		    	}
		    	
		     }
		 }catch(Exception e)
		  {
		     e.printStackTrace();
		  }
	return "Invalid Credential";	
	}

}
