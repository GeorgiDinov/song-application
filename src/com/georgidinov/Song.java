package com.georgidinov;


import java.util.Objects;

/**
 * The class represents a plausible song and has fields for
 * title, duration(timing), genre and lyrics
 * There are two chained constructors for the ease of development
 * and according to one of the specifications(default initialization in constructor)
 * if No Args constructor is called the Song object will be initialized as one of
 * Metallica songs from the black album
 */
public class Song {

    private String title;
    private String genre;
    private double timing;
    private String lyrics;


    public Song() {
        this("Sad But True", "Metal", 6.36d, "SadButTrueLyrics");
    }

    public Song(String title, String genre, double timing, String lyrics) {
        this.title = Objects.requireNonNull(title, "DefaultTitle");
        this.genre = Objects.requireNonNull(genre, "DefaultGenre");
        if (this.isValidTiming(timing)) {
            this.timing = timing;
        } else {
            this.timing = 0.0d;
        }
        this.lyrics = Objects.requireNonNull(lyrics, "DefaultLyrics");
    }


    /**
     * @return Song object details
     */
    public String getSongDetails() {
        return String.format("Song Details -> tittle: %s, genre: %s, duration: %.2f, lyrics: %s",
                this.title, this.genre, this.timing, this.lyrics);
    }

    /**
     * @param genre String parameter for comparison
     * @return true if the comparing string is equal to the
     * genre parameter ignoring the case
     */
    public boolean isTheSongGenreSameAs(String genre) {
        if (this.isValidGenre(genre)) {
            return genre.equalsIgnoreCase(this.genre);
        }
        return false;
    }

    /**
     * @return song object duration formatted with 2 digits after the floating point
     */
    public String getSongTimingString() {
        return String.format("%.2f", this.timing);
    }

    /**
     * @return the song object lyrics field
     */
    public String getSongLyrics() {
        return this.lyrics;
    }

    /**
     * @return the song object tittle field
     */
    public String getTitle() {
        return title;
    }


    /**
     * @param timing
     * @return true if timing is greater than zero
     */
    private boolean isValidTiming(double timing) {
        return timing > 0.0d;
    }

    /**
     * @param genre is a String on which will perform checks
     * @return true if the parameter is not null, blank, or empty
     */
    private boolean isValidGenre(String genre) {
        return genre != null && !genre.isBlank();
        //return genre != null && !genre.isEmpty(); // if java version < 11
    }

}
