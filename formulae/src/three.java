

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class three
 */
@WebServlet("/three")
public class three extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public three() {
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
		String n3= request.getParameter("c");
		String ch= request.getParameter("ch");
		
		int a= Integer.parseInt(n1);
		int b= Integer.parseInt(n2);
		int c= Integer.parseInt(n3);
       
		switch(ch)
		{
			case "(a+b+c)^2" :
				out.println("(a+b+c)<sup>2</sup> is: "+(a*a+b*b+c*c+2*a*b+2*b*c+2*c*a));
				break;
			case "(a+b+c)^3":
				out.println("(a+b+c)<sup>3</sup> is: "+(a*a*a+b*b*b+c*c*c+3*(b+c)*(a+b)*(a+c)));
				break;
			case "a^3+b^3+c^3-3abc":
				out.println("a^3+b^3+c^3-3abc is: "+(a+b+c)*(a*a+b*b+c*c-a*b-b*c-c*a));
				break;
		    case "(a-b-c)^2":
		    	out.println("(a-b-c)<sup>2</sup> is: "+(a*a+b*b+c*c-2*a*b+2*b*c-2*c*a));
				break;
			
	}

}
}