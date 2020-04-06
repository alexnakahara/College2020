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


@WebServlet("/ListaContato.do")
public class ListaContato extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaContato() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		// Acessando a sessão do usuário:
		HttpSession sessao = request.getSession();
		
		// Lendo os valores da sessão:
		ArrayList<Contato> contatos = (ArrayList)
			sessao.getAttribute("lista_contatos"); // Object
		
		response.setContentType("text/html");
		PrintWriter saida = response.getWriter();
		StringBuilder builder = new StringBuilder();
		builder.append("<html><head><script> function goBack(){ window.history.back(); }</script></head>");
		for(Contato c : contatos) {
			builder.append(
					"<body><div style='border-bottom: 1px solid; padding:10px; width:50%'>"+
					"<b>Nome:</b> " + c.getNome()
					+ " <b> E-mail:</b> " + c.getEmail()
					+ " <b> Telefone:</b> " + c.getTelefone() +"<br> </div>"
					);
		}
		
		builder.append("<button style='margin-top: 10px' onclick='goBack()'> voltar</button>");
		builder.append("</body></html>");

		saida.print(builder.toString());
		
	}

}
