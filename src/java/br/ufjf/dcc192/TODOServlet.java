package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;
@WebServlet(name = "TODOServlet", urlPatterns = {"/TODO.html"})
public class TODOServlet extends HttpServlet {
    private static List<String> todos = new ArrayList<String>(){{
        add("Estudar Java");
        add("Estudar HTML");
        add("Profit");
    }};

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();       
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Divisão</title>");
        out.println("</head>");        
        out.println("<body>");                 
            out.println("<form method='post'>");
                out.println("<table border=1>");
                out.println("<tr>");
                out.println("<th>Título</th>");           
                out.println("</tr>");
                for (String todos : todos) {
                    out.println("<tr>");
                    out.println("<td>" + todos + "</td>");
                    out.println("</tr>");
                }
                out.println("</table>");
                out.println("<BR><label>Nome: <input name='nome' autofocus> </label><BR><BR>");
                out.println("<input type='submit', value='Cadastrar'>");
                out.println("<input type='submit', value='Limpar'>");
            out.println("</form>");
        
        out.println("</body>");
        out.println("</html>");
    
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        todos.add(req.getParameter("nome"));
        //doGet(req, resp);
        resp.sendRedirect("TODO.html");
    }
    
}
