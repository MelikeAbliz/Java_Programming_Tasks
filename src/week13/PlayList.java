package week13;

import java.util.LinkedHashMap;
import java.util.Map;

public class PlayList { // PlayList HAS A Song

    private String name;
    private Map<String, Song> songs;

    private int count;

    public PlayList(String name){
        setName(name);
        songs = new LinkedHashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Song> getSongs() {
        return songs;
    }

    public void addSong(Song song){
        if(song == null){
            throw new NullPointerException("Song can not be null, null can not be added to the playlist");
        }

        songs.put(song.getTitle().toLowerCase(), song);

    }


    public void removeSong(String title){
        title = title.toLowerCase();

        if(!songs.containsKey(title)){
            throw new RuntimeException("The song " + title + " not found");
        }

        songs.remove(title);
    }


    public void displayPlayList(){

        if(songs.isEmpty()){
            System.out.println("Playlist is empty");
            return;
        }

        System.out.println("Playlist: " + getName());
        for (Song value : songs.values()) {
            System.out.println("\t"+value);
        }

    }

    public String toString() {
        return "PlayList{" +
                "name='" + name + '\'' +
                ", Total number of songs=" + songs.size() +
                '}';
    }


}

/*
2. Create a custom class named PlayList with the following specifications:

    Attributes:
        name (String): Used for storing the name of the playlist.
        songs (Map<String, Song>): Used for storing the title of the song as the key and the corresponding Song object as the value.

    Encapsulate the fields, but only generate a getter for the variable songs.

    Add a constructor that can set the name of the playlist.

    Actions:
        addSong(Song): Takes a Song object and adds it to the map of songs.
        removeSong(title): Takes a string argument and removes the song with the matching title from the map.
        displayPlayList(): Displays each Song object in the playlist.
 */