package day25;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country, title, Genre, director;
    public String ReleaseDate;
    public ArrayList<String> casts=new ArrayList<>();;

    public Movie(String country, String title, String genre, String director, String releaseDate) {
        this.country = country;
        this.title = title;
        Genre = genre;
        this.director = director;
        this.ReleaseDate=releaseDate;

    }

    public void addCast(String cast1){
        casts.add(cast1);
    }
    public void addCast(String[] cast){
        casts.addAll(Arrays.asList(cast));
    }

    @Override
    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", Genre='" + Genre + '\'' +
                ", director='" + director + '\'' +
                ", releaseDate=" + ReleaseDate +
                ", casts=" + casts +
                '}';
    }
}
/*
Task04:
    1. Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of the Movie

        Actions
            addCast(String): adds the given string argument to the ArrayList casts
            addCasts(String[]): adds the given string array argument to the ArrayList casts
            toString(): returns the name of the country, title, release date, and the total number of casts



 */