package week13;

import java.util.LinkedList;
import java.util.List;

public class MusicLibrary {
    /*
    public static MusicLibrary getMusicLibrary(){
        return new MusicLibrary();
    }
     */

    private List<PlayList> playLists = new LinkedList<>();

    private int count;

    // private Map<String, PlayList> playlists = new inkedHashMap();

    public List<PlayList> getPlayLists() {
        return playLists;
    }

    public void addPlayList(PlayList playlist){

        if(playlist == null){
            throw new NullPointerException("Null can not be added to the music library");
        }

        if(playlist.getSongs().isEmpty()){
            throw new RuntimeException("Empty playlist can not be added to the music library");
        }

        if(count == 10){
            throw new RuntimeException("Maximum number of playlists the music library can have is 10");
        }

        playLists.add(playlist);
        count++;
    }


    public void removePlayList(String playlistName){

       if( playLists.removeIf( p -> p.getName().equalsIgnoreCase(playlistName)) ) {
           count--;
       }

    }


    public PlayList getPlayList(String playlistName){

        for (PlayList playList : playLists) {
            if(playList.getName().equalsIgnoreCase(playlistName)){
                return playList;
            }
        }

        // return null;
        throw new RuntimeException("The playlist \"" +playlistName +"\" does not exist");
    }


    public void displayMusicLibrary(){

        if(playLists.isEmpty()){
            System.out.println("Music library is empty");
            return;
        }

        for (PlayList playList : playLists) {
            playList.displayPlayList();
        }

    }


    public String toString() {
        return "MusicLibrary{" +
                "Total number of playLists=" + count +
                '}';
    }
}

/*
3. Create a custom class named MusicLibrary with the following specifications:

    Attributes:
        playlists (List<PlayList>): Used for storing PlayList objects.

    Actions:
        addPlaylist(playList): Adds the given PlayList object to the MusicLibrary.
        removePlayList(name): Removes the playlist with the specified name from the MusicLibrary.
        getPlaylist(name): Returns the PlayList object with the given name from the list.
        displayMusicLibrary(): Displays playlists and songs of each playlist in the MusicLibrary object.

 */