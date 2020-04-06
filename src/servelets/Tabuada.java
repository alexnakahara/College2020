package servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Tabuada
 */
@WebServlet("/Tabuada.do")
public class Tabuada extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Tabuada() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter saida  = response.getWriter();
		response.setContentType("text/html");

		StringBuilder builder = new StringBuilder();
		builder.append("<center><table border=1 cellspacing=0 cellpadding = 0>");
		for(int i = 1; i <= 10; i++){
			builder.append("<tr><th style='text-align:center'> Tabuada do " + i + "</th></tr>");
		    for(int a = 0; a <= 10; a++){
		    	builder.append("<tr><td style='text-align:center'>");
		    	builder.append(i + "x" + a + "=" + i * a);
		    	builder.append("</td></tr>");
		    }
		    
		}
		builder.append("</table></center>");
		saida.println(builder.toString());
	}

}
