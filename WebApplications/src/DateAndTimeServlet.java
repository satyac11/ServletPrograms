

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class DateAndServlet
 */

public class DateAndTimeServlet extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		Date date = new Date();
		pw.println("Current Date is: "+date.toString());
		pw.println("<br>Request class name:"+req.getClass());
		pw.println("<br>Response Class name: "+res.getClass());
		pw.close();
	}
	
}
