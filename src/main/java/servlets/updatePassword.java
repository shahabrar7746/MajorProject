package servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.Mail;
import main.common;

/**
 * Servlet implementation class updatePassword
 */
@WebServlet("/updatePassword")
public class updatePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatePassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("consumerMail");
		common fun = null;
		fun = new common();
		if(email == null) {
			email = request.getParameter("sellerMail");
			
			try {
				if(fun.isNew(email, "sellerdetails")) {
				response.sendRedirect("errorPages/forgotPassword.jsp");
				}else {
					String otp = fun.generateOTP();
					String sellerName = fun.sellerName;
					Mail mail = new Mail();
					mail.sendMail(email, otp, sellerName);
					request.setAttribute("sellerMail", email);
					
					request.setAttribute("otp", mail.getOtp());
					RequestDispatcher dispatch = request.getRequestDispatcher("otp.jsp");
					dispatch.forward(request, response);
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
		
		try {
			
			if(fun.isNew(email)) {
			response.sendRedirect(".//errorPages//emailForPasswordChange.jsp");
			}else {
				String otp = fun.generateOTP();
				String consumerName = fun.consumerName;
				Mail mail = new Mail();
				mail.sendMail(email, otp, consumerName);
				request.setAttribute("mail", mail.getMail());
				

				request.setAttribute("otp", mail.getOtp());
				RequestDispatcher dispatch = request.getRequestDispatcher("otp.jsp");
				dispatch.forward(request, response);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
