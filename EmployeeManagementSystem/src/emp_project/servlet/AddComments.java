package emp_project.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import emp_project.dao.AddComments_dao;



@WebServlet("/AddComments")
public class AddComments extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AddComments() 
    {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
		String reg_Id=request.getParameter("reg_Id");
		String CreationDate=request.getParameter("creation_date");
		String dept_Id=request.getParameter("dept_Id");
		String emp_Id=request.getParameter("emp_id");
		String Comments=request.getParameter("comments");
		String Status=request.getParameter("status");
		int Reg_Id=Integer.parseInt(reg_Id);
		int Dept_Id=Integer.parseInt(dept_Id);
                int Emp_Id=Integer.parseInt(emp_Id);
        	if(AddComments_dao.insertComment(Reg_Id,CreationDate,Emp_Id,Comments,Status,Dept_Id))
        	{
        		response.sendRedirect("CommentSuccess.jsp");
        	}
        	else
        	{
        		response.sendRedirect("Failure.jsp");
        	}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
