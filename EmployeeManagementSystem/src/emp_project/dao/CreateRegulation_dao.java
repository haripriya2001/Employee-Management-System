package emp_project.dao;
import java.sql.PreparedStatement;
import emp_project.db.Login_db;

public class CreateRegulation_dao {
	public static boolean insertRegulation(String 	RegId,String Regulation_Type,String Regulation_Details,String Creation_Date,String Dept_Id)
	{
		int Regulation_Id=Integer.parseInt(RegId);
		int deparment_Id=Integer.parseInt(Dept_Id);
		
		try
		{
			PreparedStatement statement=Login_db.getPreparedStatement("insert into regulations values(?,?,?,?,?)");
            statement.setInt(1, Regulation_Id);
            statement.setString(2, Regulation_Type);
            statement.setString(3, Regulation_Details);
            statement.setString(4, Creation_Date);
            statement.setInt(5,deparment_Id);
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
