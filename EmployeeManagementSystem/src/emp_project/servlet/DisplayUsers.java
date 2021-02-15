package emp_project.servlet;
import emp_project.db.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DisplayUsers")
public class DisplayUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DisplayUsers() 
    {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<html><head><title>USERS</title><link rel='stylesheet' href='button.css'>");
			out.println("<style>");
		    out.println("#users{font-family:sans-serif; border-collapse:collapse; width:100%;}");
		    out.println("#users td,#customers th{border:1px solid #ddd; padding:8px}");
		    out.println("#users tr:nth-child(even){ background-color:#f2f2f2;}");
		    out.println("#users tr:hover{background-color:#ddd;}");
		    out.println("#users th{ padding-top:12px; padding-bottom:12px; text-align:center; background-color:#4CAF50; color:white;}");
		    out.println("#users td{text-align:center;}");
		    out.println("</style></head>");
			out.println("<body><center><table id=users>");
			out.println("<tr>");
			out.println("<th>EMPLOYEE ID</th>");
			out.println("<th>FIRST NAME </th>");
			out.println("<th>LAST NAME</th>");
			out.println("<th>DOB</th>");
			out.println("<th>EMAIL ID</th>");
			out.println("<th>DEPARTMENT ID</th>");
			out.println("</tr>");
            PreparedStatement statement=Login_db.getPreparedStatement("select * from employee");
			ResultSet resultset=statement.executeQuery();
			while(resultset.next())
			{
				int emp_Id=resultset.getInt(1);
				String f_Name=resultset.getString(2);
				String l_Name=resultset.getString(3);
				String Dob=resultset.getString(4);
				String email_Id=resultset.getString(5);
				int dept_Id=resultset.getInt(6);
				out.println("<tr align='center'>");
				out.println("<td>"+emp_Id+"</td>");
				out.println("<td>"+f_Name+"</td>");
				out.println("<td>"+l_Name+"</td>");
				out.println("<td>"+Dob+"</td>");
				out.println("<td>"+email_Id+"</td>");
		        out.println("<td>"+dept_Id+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("<input type='button' value='Home' onclick=\"location.href='AdminHome.jsp'\">");
			out.println("</center></body></html>");
			
			
		}catch(Exception e)
		{
				e.printStackTrace();
		}
	}

}
