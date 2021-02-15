package emp_project.dao;
import emp_project.db.*;
import java.sql.*;

public class AddDepartment_dao 
{
	public static boolean insertDepartment(String department_id,String dept_name)
	{
		int dept_id;
		dept_id=Integer.parseInt(department_id);
		try
		{
			PreparedStatement statement=Login_db.getPreparedStatement("insert into Department values(?,?)");
			statement.setInt(1, dept_id);
			statement.setString(2, dept_name);
			int count=statement.executeUpdate();
			System.out.println(count + " row/s affected");
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	return false;
	
}
	

}
