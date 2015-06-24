package be.vdab;

import java.util.Arrays;
import java.util.List;

public class FilmRepository {
    public List<Film> findFilm(){
        return Arrays.asList(
                new Film(1,"The hobbit",2001,"Bob"),
                new Film(2,"Iron Man",2002,"Carl"),
                new Film(3,"The Hulk",2003,"Jeff"),
                new Film(4,"Batman",2004,"Tony")
        );
    }
}
