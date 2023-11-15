package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.common;
import main.pushDb;

/**
 * Servlet implementation class service
 */
@WebServlet("/registerSeller")
public class registrationSeller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String full_name = request.getParameter("fullName");
		String businessName = request.getParameter("businessName");

		String mail = request.getParameter("mail");

		String phNumber = request.getParameter("phoneNumber");

		String shopNumber = request.getParameter("shopNo");

		String Area = request.getParameter("Area");
		String pinCode = request.getParameter("pincode");

		String state = request.getParameter("state");
		String serviceType = request.getParameter("serviceType");
String password = request.getParameter("user-password-confirm");
//System.out.println(full_name + " " + businessName + " " + mail + " " + phNumber + " " + shopNumber +  " " + Area + " " + pinCode + " " + state + " " + serviceType +  " " + password   );
		pushDb push = new pushDb();
	try {
		if(push.registerSeller(full_name, businessName, mail, phNumber, shopNumber, Area, pinCode, state, serviceType, password)) {
			//forward the requuest to seller's landing 
			PrintWriter out = response.getWriter();
			out.print("forward the requuest to seller's landing when made");
		}else {
			request.setAttribute("fullName", full_name);
			request.setAttribute("shopNo", shopNumber);
			request.setAttribute("businessName", businessName);
			request.setAttribute("phoneNumber", phNumber);
			request.setAttribute("state", state);
			request.setAttribute("Area", Area);
			request.setAttribute("pincode", pinCode);
			request.setAttribute("serviceType", serviceType);
			RequestDispatcher dispatch = request.getRequestDispatcher("/errorPages//registerSeller.jsp");
			dispatch.forward(request, response);
			
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	

}
