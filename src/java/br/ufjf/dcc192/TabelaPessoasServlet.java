package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "TabelaPessoasServlet", urlPatterns = {"/tabela-pessoas.html"})
public class TabelaPessoasServlet extends HttpServlet {

    private List<Pessoa> pessoas;

    public TabelaPessoasServlet() {
        pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("Fulano", 18, "fulano@somedomain.com"));
        pessoas.add(new Pessoa("Beltrano", 27, "beltrano@ufjf.br"));
        pessoas.add(new Pessoa("Ciclano", 32, "ciclano@hotmail.com"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try (PrintWriter out = response.getWriter()) {
            response.setContentType("text/html;charset=UTF-8");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("   <head>");
            out.println("   <title>Pessoas</title>");
            out.println("   </head>");
            out.println("   <body>");
            out.println("   <h1>Pessoas</h1>");
            out.println("   <table border=1>");
            out.println("<tr>");
            out.println("<th>Nome</th>");            
            out.println("<th>Idade</th>");            
            out.println("<th>Email</th>");            
            out.println("</tr>");
            for (Pessoa pessoa : pessoas) {
                out.println("<tr>");
                out.println("       <td>"
                        + pessoa.getNome() + "</td>");
                out.println("       <td>"
                        + pessoa.getIdade() + "</td>");
                out.println("       <td>"
                        + pessoa.getEmail()+ "</td>");
                out.println("</tr>");

            }

            out.println("   </table>");
            out.println("   </body>");
            out.println("</html>");
        }

    }

}
