

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Loginservlet
 */
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		String name = request.getParameter("uname");
		String pwd = request.getParameter("pass");
		if(name.equals("ashu11") && pwd.equals("123"))
		{
			HttpSession session = request.getSession();
			session.setAttribute("user", name);
			response.sendRedirect("Welcome");
			
		}else {
			response.sendRedirect("Login.html");
		}
		
	}

}
