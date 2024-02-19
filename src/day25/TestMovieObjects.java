package day25;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestMovieObjects {
    public static void main(String[] args) {
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/y");
        Movie movie=new Movie("USA","Java Developer","Adventure","Kuzzat Altay",
                LocalDate.of(2023,10,29).format(df));
        movie.addCast("Ozzy, Jamal, Muhtar");
        String[] cast={"Alex","Cemil","Fitim","Umit","Yildirim"};
        movie.addCast(cast);
        System.out.println(movie);

        }
}
/*
2. create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/29/2023
                    Director: Kuzzat Altay
                    Casts: Ozzy, Jamal, Muhtar and 5 more students from your group

        print the full info of the movie

 */