package gram.william;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	    Album album = new Album("TP-2");
	    album.addSong("TP-2", "2:17");
        album.addSong("Strip for you", "4:09");
        album.addSong("R&B Thug", "4:04");
        album.addSong("The Storm Is Over Now", "4:32");
        album.listSongs();

        Playlist myPlaylist = new Playlist("Will's playlist");

        myPlaylist.addSong(album.getSongList().get(1));
        myPlaylist.addSong(album.getSongList().get(3));

        Song someSong = new Song("Yahoo", "3:59");

        myPlaylist.addSong(someSong);
        myPlaylist.listSongs();

        myPlaylist.playing();

    }
}
