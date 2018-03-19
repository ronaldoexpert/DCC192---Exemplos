package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "ContadorServlet", urlPatterns = {"/contador.html"})
public class ContadorServlet extends HttpServlet {
    private static int c = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String comand = "inc";
        comand = req.getParameter("comando");
        
        if("inc".equals(comand)){
            c++;        
        }
        if ("dec".equals(comand)){
            c--;
        }
        
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();       
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Divisão</title>");
        out.println("</head>");
        out.println("<body>");           
        
            out.println("<a href = '?comando=inc'>Incrementar</a>");            
            out.println("<p>O valor de C é: " + c + " !</p>");
            out.println("<a href = '?comando=dec'>Decrementar</a>");
        
        out.println("</body>");
        out.println("</html>");
        
        
    
    }
    
}
