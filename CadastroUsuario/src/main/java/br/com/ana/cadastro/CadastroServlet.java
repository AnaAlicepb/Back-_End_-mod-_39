package br.com.ana.cadastro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CadastroServlet")
public class CadastroServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        // Aqui você pode adicionar lógica para salvar os dados, por exemplo, em um banco de dados

        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Cadastro realizado com sucesso!</h1>");
        response.getWriter().println("<p>Nome: " + nome + "</p>");
        response.getWriter().println("<p>Email: " + email + "</p>");
        response.getWriter().println("</body></html>");
    }
}
