package be.vdab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(urlPatterns = "/film")
public class FilmServlet extends HttpServlet{
    private FilmRepository repository = new FilmRepository();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Film> fi = repository.findFilm();

        req.setAttribute("films", fi);

        req.getRequestDispatcher("/WEB-INF/film.jsp").forward(req, resp);
    }
}
