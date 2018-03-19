package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ice
 */
@WebServlet(name = "SomaServlet", urlPatterns = {"/soma.html"})
public class SomaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Integer X,Y,S; 
        try {
            X = Integer.parseInt(request.getParameter("X"));
            Y = Integer.parseInt(request.getParameter("Y"));
            S = X + Y;
        } catch (NumberFormatException e) {
            out.println("<h1>ERRO:</h1>");
            out.println("<p>Você deve passar inteiros nos parâmetros X e Y!</p>");
            out.println("<p>Exemplo: <a href='?X=2&Y=3'>2 + 3</a>.</p>");
            return;

        }

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Soma</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Soma</h1>");
        out.println("<p>A soma de X=" + X + " e Y="
                + Y + " é S=" + S + "</p>");
        out.println("</body>");
        out.println("</html>");
    }



}
