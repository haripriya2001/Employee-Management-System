package emp_project.servlet;
import emp_project.db.Login_db;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DisplayDepartment")
public class DisplayDepartment extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DisplayDepartment() 
    {
        super();
        
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int dept_Id;
		String dept_name;
		try
		{   
		    response.setContentType("text/html");
		    PrintWriter out = response.getWriter();
		    out.println("<html>");
		    out.println("<head><title>DEPARTMENTS</title><link rel='stylesheet' href='button.css'>");
		    out.println("<style>");
		    out.println("#departments{font-family:sans-serif; border-collapse:collapse; width:100%;}");
		    out.println("#departments td,#customers th{border:1px solid #ddd; padding:8px}");
		    out.println("#departments tr:nth-child(even){ background-color:#f2f2f2;}");
		    out.println("#departments tr:hover{background-color:#ddd;}");
		    out.println("#departments th{ padding-top:12px; padding-bottom:12px; text-align:center; background-color:#4CAF50; color:white;}");
		    out.println("#departments td{text-align:center;}");
		    out.println("</style></head>");
		    out.println("<body>");
		    out.println("<center>");
		    out.println("<table id='departments' border=1 width=50% height=50%>");
		    out.println("<tr>");
		    out.println("<th>DEPARTMENT ID</th>");
		    out.println("<th>DEPARTMENT</th>");
		    out.println("</tr>");
		    PreparedStatement statement=Login_db.getPreparedStatement("select distinct Department_Id,Department_Name from department");
		    ResultSet resultset=statement.executeQuery();
		    while(resultset.next())
		    {
				dept_Id=resultset.getInt(1);
				dept_name=resultset.getString(2);
				out.println("<tr><td>" + dept_Id+ "</td>");
				out.println("<td>" + dept_name+ "</td></tr>");
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
