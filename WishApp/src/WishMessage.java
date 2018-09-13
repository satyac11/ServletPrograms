

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WishMessage
 */
@WebServlet("/WishMessage")
public class WishMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WishMessage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("txt/html");
		PrintWriter pw = response.getWriter();
		
		Calendar cl = Calendar.getInstance();
		int h = cl.get(Calendar.HOUR_OF_DAY);
		System.out.println("now the time is:"+h);
		if(h<12)
			pw.println("Good Morning!");
		else if(h>12 && h<17)
			pw.println("Good After Noon");
		else if(h>17 && h<18)
			pw.println("Good Evening!");
		else
			pw.println("Good Night!");
		pw.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
