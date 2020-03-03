package gram.william;

import java.util.*;

public class Playlist {
    private String playlistName;
    private LinkedList<Song> songList;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.songList = new LinkedList<Song>();
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public LinkedList<Song> getSongList() {
        return songList;
    }

    public void addSong(Song song) {
        songList.add(song);
    }

    public void removeSong(Song song) {
        if (this.findSong(song.getTitle()) != null) this.songList.remove(song);
    }

    private Song findSong(String songName) {
        for (int i = 0; i < this.songList.size(); i++) {
            Song onSong = this.songList.get(i);
            if (onSong.getTitle().equals(songName)) {
                return onSong;
            }
        }
        return null;
    }

    public void listSongs() {
        System.out.println("Songs in playlist: " + this.playlistName);
        for (int i = 0; i < this.songList.size(); i++) {
            Song song = this.songList.get(i);
            System.out.println("Song " + (i+1) + ": " + song.getTitle() + ", [" + song.getDuration() + "]");
        }
    }

    public void printList() {
        Iterator<Song> song = this.getSongList().iterator();

        while (song.hasNext()) System.out.println("Now playing: " + song.next().getTitle());
        System.out.println("=====================================");
    }

    public void playing() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = this.getSongList().listIterator();

        // Check if the linked list has any elements
        if (this.getSongList().isEmpty()) {
            System.out.println("No songs in the playlist");
        } else {
            // .next() moves to the next entry
            System.out.println("Now playing " + listIterator.next().getTitle());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine(); // Clears the input line after entered digit

            switch (action){
                case 0:
                    System.out.println("Done playing.");
                    quit = true;
                    break;
                // 1 - go to next song
                case 1:
                    // if not going forward and next exists - change direction
                    if (!goingForward) {
                        if (listIterator.hasNext()) listIterator.next();  // changes direction
                        goingForward = true;  // tells us we've changed direction
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().getTitle());
                    } else {
                        System.out.println("Reached end of the playlist");
                        goingForward = false;  // we won't be going forward when at end
                    }
                    break;
                // 2 - go to previous song
                case 2:
                    // if going forward and previous exists - change direction
                    if (goingForward) {
                        if (listIterator.hasPrevious()) listIterator.previous();  // changes direction
                        goingForward = false;  // tells us we've changed direction
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().getTitle());
                    } else {
                        System.out.println("We are at start of the list");
                        goingForward = true;  // can only go forward when at beginning
                    }
                    break;
                case 3:
                    // if going forward and next exists - change direction
                    if (goingForward) {
                        if (listIterator.hasPrevious()) listIterator.previous();  // changes direction
                        System.out.println("Now playing " + listIterator.next().getTitle());
                        listIterator.next();  // Go back to going forward
                    } else {
                        if (listIterator.hasNext()) listIterator.next();  // changes direction
                        System.out.println("Now playing " + listIterator.previous().getTitle());
                        listIterator.previous();  // Go back to going backward
                    }
                    break;
                // 4 - print menu options
                case 4:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \n press ");
        System.out.println(
                "0 - to quit \n" +
                        "1 - go to next song \n " +
                        "2 - go to previous song \n " +
                        "3 - replay song \n " +
                        "4 - print menu options"
        );
    }
}
