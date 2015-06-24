package be.vdab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/sessionz")
public class Sessionz extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        PrintWriter out = resp.getWriter();

        session.getAttribute("product");
        Double price = (Double) session.getAttribute("prijs");
        Integer amount = (Integer) session.getAttribute("aantal");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Order</title><link href=\"style.css\"/></head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<body>");
        out.println("<h1>Order</h1>");
        out.println("<form action = '/sessionz' method='post'>Product: <select>\n" +
                "\" +\n" +
                "                \"  <option value=\\\"Pizza\\\">Pizza</option>\\n\" +\n" +
                "                \"  <option value=\\\"Kebab\\\">Kebab</option>\\n\" +\n" +
                "                \"  <option value=\\\"Broodje\\\">Broodje</option>\\n\" +\n" +
                "                \"  <option value=\\\"Frietjes\\\">Frietjes</option>\\n\" +\n" +
                "                \"</select></br>");
        out.println("Prijs : <select>\n" +
                "\" +\n" +
                "                \"  <option value=\\\"Pizza\\\">9.00</option>\\n\" +\n" +
                "                \"  <option value=\\\"Kebab\\\">8.00</option>\\n\" +\n" +
                "                \"  <option value=\\\"Broodje\\\">3.50</option>\\n\" +\n" +
                "                \"  <option value=\\\"Frietjes\\\">4.50</option>\\n\" +\n" +
                "                \"</select></br>");
        out.println("Aantal : <input type='text' name='aantal'></br>");
        out.println("<input type='submit' value='Bestel'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Order COMPLETE</title><link href=\"style.css\"/></head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<body>");
        out.println("<h1>Order complete!</h1>");
        out.println("<h2>Bestelling: " + req.getParameter("product") + " x " + req.getParameter("aantal") + " </br>" +
                "Totaal prijs = " + " " + "</h2>");
        out.println("</body></html>");
    }
}
