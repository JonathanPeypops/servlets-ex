package be.vdab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/register")
public class FormServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Register</title><link href=\"style.css\"/></head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<body>");
        out.println("<h1>Register</h1>");
        out.println("<form action = '/register' method='post'>First name: <input type='text' name='firstname'></br>");
        out.println("Last name: <input type='text' name='lastname'></br>");
        out.println("<input type='submit' value='Register'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Register COMPLETE</title><link href=\"style.css\"/></head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<body>");
        out.println("<h1>Register complete!</h1>");
        out.println("<h2>Welcome " + req.getParameter("firstname")+" " + req.getParameter("lastname") + " enjoy this page" + "</h2>");
        out.println("</body></html>");
    }
}
