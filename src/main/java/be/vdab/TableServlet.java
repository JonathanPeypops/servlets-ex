package be.vdab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/multiply")
public class TableServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Multiply</title><link href=\"style.css\"/></head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<body>");
        out.println("<h1>Table</h1>");
        printTable(out);
        out.println("</body></html>");
    }

    private void printTable(PrintWriter out){
        out.println("<table>");

        for(int x=1; x<=25;x++){
            out.println("<tr>");
            for( int y=1; y<=25;y++){
                out.println("<td>" + x * y + "</td>");
            }
            out.println("</tr>");
        }
        out.println("</table>");
    }
}
