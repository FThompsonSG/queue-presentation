package com.sparta.queuepresentation;

public class Song {

    private String name;
    private String artist;
    private double duration;
    private String album;

    public Song(String name, String artist, double duration, String album) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
        this.album = album;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                ", album='" + album + '\'' +
                '}';
    }

}
