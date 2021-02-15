package emp_project.servlet;
import emp_project.dao.AddDepartment_dao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/addDepartment")

public class AddDepartment_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AddDepartment_servlet() 
    {
        super();
      
    }
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String dept_id =request.getParameter("dept_id");
		String dept_name=request.getParameter("dept_name");
			if(AddDepartment_dao.insertDepartment(dept_id,dept_name))
			{
				response.sendRedirect("Success.jsp");
			}
			else
			{
				response.sendRedirect("Failure.jsp");
			}
        
	}

}
