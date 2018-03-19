package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "DivisaoServlet", urlPatterns = {"/divisao.html"})
public class DivisaoServlet extends HttpServlet {

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
            out.println("<label>X: <input name='X'> </label><BR>");
            out.println("<label>Y: <input name='Y'> </label><BR><BR>");
            out.println("<label>Result: <input name='Result'> </label><BR><BR>");
            out.println("<input type='submit'>");
            out.println("<input type='reset'>");
        out.println("</form>");
        
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String X = req.getParameter("X");
        String Y = req.getParameter("Y");
        
        Float D;
        D = Float.parseFloat(X) / Float.parseFloat(Y);
        
        
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        try{
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Divisão</title>");
            out.println("</head>");
            out.println("<body>");           

            out.println("<H1>Divisão</H1>");
            out.println("<p>A divisao de X: " + X 
                    + " por Y: " + Y 
                    + " é Result: " + D + "</p>");
            out.println("<label>Result: <textarea disabled> " + D + "</textarea></label><BR><BR>");

            out.println("<BR><a href='divisao.html'>Voltar</a>");
        }catch (NumberFormatException | ArithmeticException e){
            out.println("<H1>Erro. Você deve passar X e Y. E Y tem que ser maior que 0(zero).</H1>");
        }       
        
        out.println("</body>");
        out.println("</html>");
    }
    
    
    
}
