package gram.william;

import java.util.ArrayList;

public class Album {
    private String albumName;
    // private String artist;
    private ArrayList<Song> songList;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songList = new ArrayList<Song>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Song> getSongList() {
        return songList;
    }

    public void addSong(String title, String duration) {
        if (findSong(title) == null) {
            this.songList.add(new Song(title, duration));
        }
    }

    /*
    public void addSong(Song song) {
        songList.add(song);
    }
     */

    public void removeSong(Song song) {
        if (this.findSong(song.getTitle()) != null) this.songList.remove(song);
    }

    private Song findSong(String songName) {
        // for song in songList
        for (Song onSong: this.songList) {
            if (onSong.getTitle().equals(songName)) return onSong;
        }
        return null;
    }

    /*
    private Song findSong(String songName) {
        for (int i = 0; i < this.songList.size(); i++) {
            Song onSong = this.songList.get(i);
            if (onSong.getTitle().equals(songName)) {
                return onSong;
            }
        }
        return null;
    }
    */

    public void listSongs() {
        System.out.println("Songs on album: " + this.albumName);
        for (int i = 0; i < this.songList.size(); i++) {
            Song song = this.songList.get(i);
            System.out.println("Song " + (i+1) + ": " + song.getTitle() + ", [" + song.getDuration() + "]");
        }
    }
}
