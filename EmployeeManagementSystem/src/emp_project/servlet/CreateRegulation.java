package emp_project.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import emp_project.dao.*;

@WebServlet("/CreateRegulation")
public class CreateRegulation extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public CreateRegulation() 
    {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String RegulationId=request.getParameter("Regulation_Id");
		String RegulationType=request.getParameter("Regulation_Type");
		String RegulationDetails=request.getParameter("Regulation_Details");
		String CreationDate=request.getParameter("Creation_Date");
		String DepartmentId=request.getParameter("Department_Id");
		if(CreateRegulation_dao.insertRegulation(RegulationId,RegulationType,RegulationDetails,CreationDate,DepartmentId))
		 {
			 
			response.sendRedirect("Success.jsp");
		 }
		 
		 else
		 {
			 response.sendRedirect("Failure.jsp");
		 }
	}
		
}


