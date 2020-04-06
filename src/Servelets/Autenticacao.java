package Servelets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Autenticacao
 */
@WebServlet("/Autenticacao.do")
public class Autenticacao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Autenticacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nome = request.getParameter("name");
		String senha = request.getParameter("password");
		PrintWriter saida = response.getWriter();
		response.setContentType("text/html");

		if (nome.isEmpty() || senha.isEmpty()) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			saida.println("<script>alert('Você deve preencher o login!')</script>Volte e tente novamente!");

		} else if (nome.equals("joao@teste.com.br") && senha.equals("13579")) {
			saida.println("<h2>Bem vindo!</h2>Login foi realizado!");
			
		} else {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			saida.println("Você não tem acesso");
		}
	}

}
