package emp_project.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import emp_project.db.Login_db;
import emp_project.dao.*;


@WebServlet("/UserRegulation")
public class UserRegulation extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    public UserRegulation() 
    {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try
		{
			String validate="";
			HttpSession session=request.getSession(false);
			String userId=(String)session.getAttribute("userId");
			int UserId=Integer.parseInt(userId);
			String dept_Id=request.getParameter("dept_Id");
			int department_Id=Integer.parseInt(dept_Id);
	                PreparedStatement statement=Login_db.getPreparedStatement("select * from regulations where Department_Id="+department_Id);
			ResultSet resultset=statement.executeQuery();
	        while(resultset.next())
		    {   
	        	
		            int Regulation_Id=resultset.getInt(1);
		       	    String Regulation_Type=resultset.getString(2);
			    String Regulation_Details=resultset.getString(3);
			    String Creation_Date=resultset.getString(4);
			    int Dept_Id=resultset.getInt(5);
			    System.out.println(Regulation_Id);
			    System.out.println(Creation_Date);
			    System.out.println(Dept_Id);
			    validate=CommentsExistOrNot.CommentsExist(Regulation_Id,UserId,Creation_Date,Dept_Id);
			    session.setAttribute("validate", validate);
			   
			        if(validate.equals("Yes"))
				    {
				        out.println("<html><head><link rel='stylesheet' href='regulation.css'></head><body><form class='form' action='AddComments' method='post'><h1>REGULATION</h1>");
					out.println("<h3>REGULATION ID</h3>");
					out.println(" <input class='input' style='text-align:center; color:#2ecc71;' type='text' name='reg_Id' value='"+Regulation_Id+"'readonly>");
					out.println("<h3>REGULATION TYPE</h3>");
					out.println(" <input class='input'style='text-align:center;  color:#2ecc71;' type='text' value='"+Regulation_Type+"'readonly>");
					out.println("<h3>REGULATION DETAILS</h3>");
					out.println(" <textarea class='input' style='text-align:left; color:#2ecc71;'readonly>"+Regulation_Details+"</textarea>");
					out.println("<h3>CREATION DATE</h3>");
					out.println(" <input  class='input' style='text-align:center; color:#2ecc71;' type='text' name='creation_date' value='"+Creation_Date+"'readonly>");
					out.println("<h3>DEPARTMENT ID</h3>");
					out.println(" <input class='input' style='text-align:center; color:#2ecc71;' type='text' name='dept_Id' value='"+Dept_Id+"'readonly>");
					out.println("<h3>EMPLOYEE ID</h3>");
					out.println(" <input  class='input' style='text-align:center;' type='text' name='emp_id'>");
					out.println("<h3>COMMENTS</h3> ");
					out.println(" <textarea class='input' style='text-align:center;' type='text' name='comments'></textarea>");	
					out.println("<h3>STATUS</h3>");
					out.println(" <input class='input' style='text-align:center;' type='text' name='status' value='yes' readonly>");
					out.println("<input class='click' type='submit' value='send'>");
				    }
			        
			    }
	       
			String validation=(String)session.getAttribute("validate");
			if( validation==null || validation.equals("No"))
			{
				response.sendRedirect("Regulation.jsp");
			}
			else 
			{
				response.sendRedirect("Regulation.jsp");
			}
	        
	        
	        
		  }catch(Exception e)
		  {
		    	e.printStackTrace();
		  }
		
	}
  
}
