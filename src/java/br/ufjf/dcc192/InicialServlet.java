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
@WebServlet(name = "InicialServlet", urlPatterns = {"/index.html"})
public class InicialServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InicialServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Página inicial</h1>");
            out.println("<ul>");
            out.println("<li><a href='index.html'>Início</a></li>");
            out.println("<li><a href='relogio.html'>Relógio</a></li>");
            out.println("<li><a href='numeros.html'>Números</a> (");
            out.println("<a href='pares.html'>pares</a> /");
            out.println("<a href='impares.html'>ímpares</a>)</li>");
            out.println("<li><a href='pessoas.html'>Pessoas</a></li>");
            out.println("<li><a href='tabela-pessoas.html'>Pessoas (tabela)</a></li>");
            out.println("<li><a href='requisicao.html'>Requisição</a></li>");
            out.println("<li><a href='soma.html'>Soma</a></li>");
            out.println("<li><a href='produto-resultado.html'>Produto</a></li>");
            out.println("<li><a href='divisao.html'>Divisão</a></li>");
            out.println("<li><a href='contador.html'>Contador</a></li>");
            out.println("<li><a href='TODO.html'>Todos Estudos</a></li>");
            out.println("</ul>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
