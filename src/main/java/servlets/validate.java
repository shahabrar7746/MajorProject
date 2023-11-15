package servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.Mail;
import main.common;

/**
 * Servlet implementation class validate
 */
public class validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public validate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String mail = (String) session.getAttribute("mail");
		   
		String otp = (String) session.getAttribute("otp");
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String num3 = request.getParameter("num3");
		String num4 = request.getParameter("num4");
		String num5 = request.getParameter("num5");
		String num6 = request.getParameter("num6");
		num1 = num1 + num2 + num3 + num4 + num5 + num6;
		if(num1.equals(otp)) {
			common c = new common();
			try {
				
				request.setAttribute("mail", mail);
				
				request.setAttribute("consumerId" ,c.getConsumerId(mail));
				RequestDispatcher dispatch = request.getRequestDispatcher("newPassword.jsp");
				dispatch.forward(request, response);
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			
			request.setAttribute("otp", otp);
			request.setAttribute("consumerMail", mail);
			RequestDispatcher dispatch = request.getRequestDispatcher("/errorPages/otp.jsp");
			dispatch.forward(request, response);
		
		
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {//doPost is used for seller
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		 String mail = (String)session.getAttribute("sellerMail");
		
		String otp = (String) session.getAttribute("otp");
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String num3 = request.getParameter("num3");
		String num4 = request.getParameter("num4");
		String num5 = request.getParameter("num5");
		String num6 = request.getParameter("num6");
		num1 = num1 + num2 + num3 + num4 + num5 + num6;	
		if(num1.equals(otp)) {
			common c = new common();
			try {
				
					mail = (String) session.getAttribute("sellerMail");
				
					
					request.setAttribute("sellerId" ,c.getSellerId(mail));
				
					RequestDispatcher dispatch = request.getRequestDispatcher("newPassword.jsp");// change it to new password page for seller.
					dispatch.forward(request, response);
					
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{mail = (String) session.getAttribute("sellerMail");
		request.setAttribute("otp", otp);
		request.setAttribute("sellerMail", mail);
		RequestDispatcher dispatch = request.getRequestDispatcher("/errorPages/otp.jsp");
		dispatch.forward(request, response);
	}
	}

}
