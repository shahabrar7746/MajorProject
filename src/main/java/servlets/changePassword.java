package servlets;

import java.io.IOException;
import  main.login;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.changePasswords;

/**
 * Servlet implementation class changePassword
 */
public class changePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public changePassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		String password = request.getParameter("password");
		String consumerId = (String) request.getSession().getAttribute("mail");
		if(consumerId == null) {
            String sellerId = 	(String) request.getSession().getAttribute("sellerId");
			changePasswords cp = new changePasswords();
try {
	cp.changePasswordSeller(password, sellerId);
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Make a login lading page for sellers and dispatch req and res from here.
		}else{
			changePasswords cp = new changePasswords();
			try {
				cp.changePasswordConsumer(password, consumerId);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			login login = new login();
			try {
				login.login("dummy", password, consumerId);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("consumerId", login.getConsumerId());
			RequestDispatcher dispatch = request.getRequestDispatcher("afterLogin.jsp");
			dispatch.forward(request, response);	
		
		}
		}

}
