package servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.login;

/**
 * Servlet implementation class login
 */
@WebServlet("/loginConsumer")
public class loginConsumer extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("mail");
		String name = request.getParameter("name");;
		String password = request.getParameter("password");
		login Login = new login();
		

		try {
			String isExist = Login.login(name, password, email);
			if(isExist.equals("email exists")) {
				//forward req. if user exists to landing page.
				
		request.setAttribute("consumerId", Login.getConsumerId());
		RequestDispatcher dispatch = request.getRequestDispatcher("afterLogin.jsp");
		
		dispatch.forward(request, response);
		      
			} else { 
				if(isExist.equals("password is wrong")) {
					request.setAttribute("msg","*Entered Password is Wrong*" );
				}else {
				request.setAttribute("msg","*email does not exist*" );
				}
			
				//code if user does not exist.
				request.setAttribute("name", name);
				request.setAttribute("email", email);
				RequestDispatcher dispatch = request.getRequestDispatcher(".//errorPages/loginConsumer.jsp");
				
				dispatch.forward(request, response);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
