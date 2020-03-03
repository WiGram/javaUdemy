package gram.william;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Song t1 = new Song("TP-2", "2:17");
        Song t2 = new Song("Strip for you", "4:09");
        Song t3 = new Song("R&B Thug", "4:04");
        Song t19 = new Song("The Storm Is Over Now", "4:32");

	    Album album = new Album("TP-2");
	    album.addSong(t1);
        album.addSong(t2);
        album.addSong(t3);
        album.addSong(t19);
        album.listSongs();

        Playlist myPlaylist = new Playlist("Will's playlist");

        myPlaylist.addSong(album.getSongList().get(1));
        myPlaylist.addSong(album.getSongList().get(3));

        Song someSong = new Song("Yahoo", "3:59");

        myPlaylist.addSong(someSong);
        myPlaylist.listSongs();

        myPlaylist.printList();

        myPlaylist.playing();

    }
}
