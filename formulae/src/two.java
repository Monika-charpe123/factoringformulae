

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class two
 */
@WebServlet("/two")
public class two extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public two() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<h1 align= 'center'>Output of Calculator</h1>");
		out.println("<body bgcolor='pink'></body>");
		
		String n1= request.getParameter("a");
		String n2= request.getParameter("b");
		String ch= request.getParameter("ch");
		
		int a= Integer.parseInt(n1);
		int b= Integer.parseInt(n2);
		
		
		switch(ch)
		{
			case "(a+b)^2":
				out.println("(a+b)<sup>2</sup> is: "+(a*a+b*b+2*a*b));
				break;
			case "(a-b)^2":
				out.println("(a-b)<sup>2</sup> is: "+(a*a+b*b-2*a*b));
				break;
			case "(a+b)^3":
				out.println("(a+b)<sup>3</sup> is: "+(a*a*+3*a*a*b+3*a*b*b+b*b*b));
				break;
			case "(a-b)^3":
				out.println("(a-b)<sup>3</sup> is: "+(a*a*-3*a*a*b+3*a*b*b-b*b*b));
				break;
			case "a^3+b^3":	
				out.println("a<sup>3</sup>+b<sup>3</sup> is: "+((a+b)*(a*a-a*b+b*b)));
				break;
			case "a^3-b^3":	
				out.println("a<sup>3</sup>-b<sup>3</sup> is: "+((a-b)*(a*a+a*b+b*b)));
				break;
				
		}		
					
		}

}


