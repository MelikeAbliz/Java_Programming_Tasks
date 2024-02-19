package week13;

public class Song {

    final private String title, artist, genre;
    final private int releaseYear;
   // final private LocalTime duration;

    public Song(String title, String artist, String genre, int releaseYear) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.releaseYear = releaseYear;
      //  this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }


    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }

}

/*
1. Create a custom class named Song with the following specifications:

    Attributes:
        title (String): Represents the title of the song.
        artist (String): Represents the artist of the song.
        genre (String): Represents the genre of the song.
        releaseYear (int): Represents the release year of the song.
        duration (localTime)

    Encapsulate all the fields.

    Add a constructor that can set all the fields.

    Add a toString() method.
 */