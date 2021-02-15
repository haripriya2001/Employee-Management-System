package emp_project.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import emp_project.db.Login_db;


@WebServlet("/DisplayUserDetails")
public class DisplayUserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DisplayUserDetails() 
    {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try
		{
			HttpSession session=request.getSession();
			String userId=(String)session.getAttribute("userId");
			int UserId=Integer.parseInt(userId);
			PreparedStatement statement=Login_db.getPreparedStatement("select * from employee where Employee_Id = "+UserId);
			ResultSet resultset=statement.executeQuery();
			while(resultset.next())
			{
				int userID=resultset.getInt(1);
				String First_Name=resultset.getString(2);
				String Last_Name=resultset.getString(3);
				String DOB=resultset.getString(4);
				String Email_Id=resultset.getString(5);
				int dept_Id=resultset.getInt(6);
				out.println("<html><head><link rel='stylesheet' href='button.css'>");
				out.println("<style> td{padding-top:12px; padding-bottom:12px;  border:1px solid black; font-weight:bold; text-align:center; background-color:#4CAF50; color:white;}");
				out.println("div{width:500px;padding:50px; ;position:absolute;top:50%;left:50%;transform:translate(-50%,-35%);text-align:center;border-radius:24px;}");
				out.println("</style></head><body style='background-color:#D9DDDC;'><h1 style='text-align:center ; color:black; padding-top:50px; text-shadow:2px 2px 4px #4CAF50;'>MY DETAILS</h1><div><table width=100% height=50%><tr>");
				out.println("<td>EMPLOYEE ID</td>");
				out.println("<td>"+userID+"</td></tr>");
				out.println("<td>FIRST NAME</td>");
				out.println("<td style='text-transform:uppercase'>"+First_Name+"</td></tr>");
				out.println("<td>LAST NAME</td>");
				out.println("<td style='text-transform:uppercase'>"+Last_Name+"</td></tr>");
				out.println("<td>DOB</td>");
				out.println("<td>"+DOB+"</td></tr>");
				out.println("<td>EMAIL ID</td>");
				out.println("<td>"+Email_Id+"</td></tr>");
				out.println("<td>DEPARTMENT ID</td>");
				out.println("<td>"+dept_Id+"</td></tr>");
			    out.println("</div></table>");	
			}
			
			out.println("<input type='button' value='Home' onclick=\"location.href='AdminHome.jsp'\">");
			 out.println("</body></html>");
			
		}catch(Exception e)
		{
		 e.printStackTrace();	
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
