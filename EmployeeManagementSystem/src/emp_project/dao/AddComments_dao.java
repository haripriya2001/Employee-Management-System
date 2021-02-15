package emp_project.dao;
import java.sql.PreparedStatement;
import emp_project.db.Login_db;

public class AddComments_dao {
	public static boolean insertComment(int Reg_Id,String CreationDate,int Emp_Id,String Comments,String status,int Dept_Id)
	{
		
		try
		{
			PreparedStatement statement=Login_db.getPreparedStatement("insert into statusreport values(?,?,?,?,?,?)");
		        statement.setInt(1, Reg_Id);
		        statement.setString(2, status);
                        statement.setInt(3,Emp_Id );
			statement.setString(4, Comments);
			statement.setString(5,CreationDate);
			statement.setInt(6, Dept_Id);
			int count=statement.executeUpdate();
			System.out.println(count+" row/s affected");
			return true;
	        }catch(Exception e)
		{
        	e.printStackTrace();	
		}
		return false;
	  }
}
