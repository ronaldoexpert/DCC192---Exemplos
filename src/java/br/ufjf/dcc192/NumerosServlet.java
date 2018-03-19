package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "NumerosServlet", urlPatterns = {"/numeros.html", "/impares.html", "/pares.html"})
public class NumerosServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Números</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Números</h1>");
            out.println(request.getServletPath());
            out.println("<ul>");
            if(request.getServletPath().equals("/numeros.html")){
                for (int n = 1; n <= 100; n++) {
                    out.println("<li>"
                            + n + "</li>");
                }
            } else if(request.getServletPath().equals("/pares.html")){
                for (int n = 2; n <= 100; n+=2) {
                    out.println("<li>"
                            + n + "</li>");
                }
            } else {
                for (int n = 1; n <= 100; n+=2) {
                    out.println("<li>"
                            + n + "</li>");
                }
            }
            
            out.println("</ul>");
            out.println("</body>");
            out.println("</html>");
        }
    }


}
