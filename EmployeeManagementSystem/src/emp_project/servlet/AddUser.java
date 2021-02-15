package emp_project.servlet;
import emp_project.dao.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddUser() {
        super();
        
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
    	
	}
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String EmpId=request.getParameter("Employee_Id");
		String firstName=request.getParameter("First_Name");
		String LastName=request.getParameter("Last_Name");
		String Dob=request.getParameter("DOB");
		String Email_Id=request.getParameter("Email_Id");
		String DeptId=request.getParameter("Dept_Id");
		String userId=request.getParameter("user_Id");
		String password=request.getParameter("password");
		String role=request.getParameter("Role");
		
		 if(AddUser_dao.insertUser(EmpId,firstName,LastName,Dob,Email_Id,DeptId))
		 {
			 if(AddUser_dao.set_UserId_PassWord(userId, password,role))
			 {
				 response.sendRedirect("Success.jsp");
			 }
		 }
		 else
		 {
			 response.sendRedirect("Failure.jsp");
		 }
	}

}
