package emp_project.servlet;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import emp_project.bean.*;
import emp_project.dao.Login_dao;
import emp_project.servlet.Login_servlet;

@WebServlet("/login_servlet")
public class Login_servlet extends HttpServlet 
{
    private static final long serialVersionUID = 1L;
    public Login_servlet() 
    {
        super();
        
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String userName = request.getParameter("userId");
		String passWord= request.getParameter("passWord");
		emp_project.bean.Login_bean loginbean = new Login_bean();
		loginbean.setUserName(userName);
		loginbean.setPassWord(passWord);
                try
		{
			String validate=Login_dao.authenticateLoginUser(loginbean);
			if(validate=="admin")
			{
				HttpSession session=request.getSession();
				session.setAttribute("userId", userName);
	                        session.setMaxInactiveInterval(20);
				response.sendRedirect("AdminHome.jsp");
			}
			else if(validate=="employee")
			{
				HttpSession session=request.getSession();
				session.setAttribute("userId", userName);
		                session.setMaxInactiveInterval(20);
				response.sendRedirect("EmployeeHome.jsp");
			}
			else
			{
				request.setAttribute("error", "Invalid Credentials");
                                RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
                                rd.include(request, response);
                        }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
