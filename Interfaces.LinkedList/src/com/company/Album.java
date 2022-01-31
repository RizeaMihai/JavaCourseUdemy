package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> albumSongs;

    public Album (String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.albumSongs = new ArrayList<Song>();
    }

    private Song findSong(String title) {
        for (Song checkedSong : albumSongs) {
            if (checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addSong (String title, double duration) {
        if (findSong(title) == null) {
            this.albumSongs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList (int trackNumber, List<Song> playlist) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= this.albumSongs.size())) {
            playlist.add(this.albumSongs.get(index));
            return true;
        }
        System.out.println("This album doesn't have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList (String songName, List<Song> playlist) {
        Song checkedSong = findSong(songName);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This album doesn't have a track called " + songName);
        return false;
    }
}
