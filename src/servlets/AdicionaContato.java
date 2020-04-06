package servlets;

import models.Contato;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdicionaContato
 */
@WebServlet("/AdicionaContato.do")
public class AdicionaContato extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdicionaContato() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome_contato");
		String telefone = request.getParameter("telefone_contato");
		String email = request.getParameter("email_contato");

		PrintWriter saida = response.getWriter();

		// Criando um objeto de sessão do usuário:
		HttpSession sessao = request.getSession();

		// Instanciando um objeto do tipo Contato:
		Contato contato = new Contato(nome, email, telefone);
		if (sessao.getAttribute("lista_contatos") != null) {

			ArrayList<Contato> contatos = (ArrayList) sessao.getAttribute("lista_contatos");
			contatos.add(contato);
			// Adicionando a lista de contatos a sessão do usuário:
			sessao.setAttribute("lista_contatos", contatos);

			// Redirecionar o usu�rio para listagem:
			response.sendRedirect("ListaContato.do");

		} else {

			// Adicionando o objto contato dentro de uma lista:
			ArrayList<Contato> contatos = new ArrayList();
			// Adicionando um novo contato:
			contatos.add(contato);
			// Adicionando a lista de contatos à sessão do usuário:
			sessao.setAttribute("lista_contatos", contatos);

			// Redirecionar o usu�rio para listagem:
			response.sendRedirect("ListaContato.do");
		}

	}

}
