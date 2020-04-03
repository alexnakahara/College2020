package Servelets;

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


		for(int i = 1; i <= 10; i++){

		    for(int a = 0; a <= 10; a++){

		    	saida.println(i + "x" + a + "=" + i * a + "<br>");
		    	if(a == 10) {
		    		saida.println("_______________" + "<br>");
		    	}

		    }
		    
		}
	}

}
