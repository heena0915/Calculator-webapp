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
	throws ServletException, IOException {
		//HttpSession session = req.getSession(true);
		
		BasicCalc det=new BasicCalc();
		double a= Double.valueOf(req.getParameter("a"));
	    double b= Double.valueOf(req.getParameter("b"));
		det.seta(a);
		det.setb(b);
		String operation= req.getParameter("operation");
	System.out.println("cdf"+operation);
		switch(operation)
	    {
	        case "Add" : 
	        	  c=det.add();
	        	  System.out.println("cdf12");
	            break;
	        case "Subtract": 
	        	c=det.subtract();
	           break;
	        case "Multiply" :
	        	c=det.multiply();
	            break;
	        case "Divide" : 
	        	c=det.divide();
	            break;
	       
	        default : System.out.print("Wrong Choice!!!");
	            break;
	    }
		
		System.out.println("cdf" +c);
			req.setAttribute("answer", c);

		
		RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
		rd.forward(req, resp); 
		} 
		
		}
	



	