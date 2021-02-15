package emp_project.dao;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import emp_project.db.Login_db;

public class CommentsExistOrNot {
	public static String CommentsExist(int Regulation_Id, int UserId,String Creation_Date,int Dept_Id)
	{ 
		try
		{
		PreparedStatement statement=Login_db.getPreparedStatement("select * from statusreport where Department_Id="+Dept_Id);
		ResultSet resultset=statement.executeQuery();
			while(resultset.next())
			{
			    int reg_Id=resultset.getInt(1);
				String Status=resultset.getString(2);
				int emp_Id=resultset.getInt(3);
				String Create_Date=resultset.getString(5);
				int department_Id=resultset.getInt(6);
				
				if( reg_Id==Regulation_Id && Creation_Date.equals(Create_Date) && department_Id==Dept_Id && Status.equals("yes") && emp_Id==UserId )
				{
					return "No";
				}
		        }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	    	return "Yes";
	}
}
