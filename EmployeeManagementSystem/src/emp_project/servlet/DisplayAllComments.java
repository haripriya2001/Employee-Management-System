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


import emp_project.db.Login_db;


@WebServlet("/DisplayAllComments")
public class DisplayAllComments extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DisplayAllComments() 
    {
        super();
        
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try{
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
			out.println("<th>REGULATION ID</th>");
			out.println("<th>STATUS </th>");
			out.println("<th>EMPLOYEE ID</th>");
			out.println("<th>COMMENTS</th>");
			out.println("<th>CREATION DATE</th>");
			out.println("<th>DEPARTMENT ID</th>");
			out.println("</tr>");
		    PreparedStatement statement=Login_db.getPreparedStatement("select * from statusreport");
			ResultSet resultset=statement.executeQuery();
			while(resultset.next())
			{
		    int Regulation_Id=resultset.getInt(1);
			String Status=resultset.getString(2);
			int Emp_Id=resultset.getInt(3);
			String Comments=resultset.getString(4);
			String CreationDate=resultset.getString(5);
			int Department_Id=resultset.getInt(6);
				out.println("<tr align='center'>");
				out.println("<td>"+Regulation_Id+"</td>");
				out.println("<td>"+Status+"</td>");
				out.println("<td>"+Emp_Id+"</td>");
				out.println("<td>"+Comments+"</td>");
				out.println("<td>"+CreationDate+"</td>");
		        out.println("<td>"+Department_Id+"</td>");
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
			
	}

}
