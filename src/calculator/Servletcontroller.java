package calculator;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ServletController")



	public class Servletcontroller extends HttpServlet {

	private static final long serialVersionUID = 1L;
	 double c;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException 
	{
		// Create an object of BasicCalc class
		
		//get parameter with req.getparameter() method and 
		
		// set the values with set parameter into variable a, b
		
		// get parameter operation 
		
	//	switch (operation)		
		{
		//write switch cases for calling different method of operations
		}
		RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
		rd.forward(req, resp); 
		} 
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
	doGet(req, resp);
	}
}
	



	