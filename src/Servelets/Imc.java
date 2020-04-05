package Servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Imc
 */
@WebServlet("/Imc.do")
public class Imc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Imc() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		double altura = Double.parseDouble(request.getParameter("altura"));
		double peso = Double.parseDouble(request.getParameter("peso"));
		StringBuilder builder = new StringBuilder();
		PrintWriter saida = response.getWriter();
		response.setContentType("text/html");
		
		double imc = peso / (Math.pow(altura, 2));
		
		if (imc < 18.5)
			builder.append("Abaixo do peso ideal, vamos melhorar!");
		else if ((imc > 18.5) && (imc < 24.9))
			builder.append("Voce esta no peso ideal, parabens!");
		else if ((imc > 25.0) && (imc < 29.9))
			builder.append("Voce está com excesso de peso, vamos melhorar!");
		else if ((imc > 30.0) && (imc < 34.9))
			builder.append("Obesidade Classe I, cuidado!");
		else if ((imc > 35.0) && (imc < 39.9))
			builder.append("Obesidade Classe II, ainda temos como mudar isso!");
		else if (imc >= 40)
			builder.append("Obesidade Classe III, procure ajuda, nada está perdido!");
		
		saida.println("Olá, " + nome + "!<br/>" + builder.toString() + "<br/>Seu IMC: " + imc);

	}

}
