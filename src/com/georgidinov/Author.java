package com.georgidinov;


import java.util.Objects;


/**
 * The class represents plausible song artist and author
 * Has fields for name, age and song
 * can be extended to hold list of songs, or album object holding songs
 * Two chained constructors, for testing purposes
 * the No Args constructor will default to the group metallica and the default song object
 * (which is metallica song for now)
 */
public class Author {

    private String name;
    private int age;
    private Song song;


    public Author() {
        this("Metallica", 38, new Song());
    }

    public Author(String name, int age, Song song) {
        this.name = Objects.requireNonNull(name, "DefaultName");
        this.age = this.ageValidator(age);
        if (this.isValidSong(song)) {
            this.song = song;
        } else {
            this.song = new Song();
        }
    }


    /**
     * @return String containing details for the author like name, age etc.
     */
    public String getAuthorDetails() {
        return String.format("Author: %s Age: %d", this.name, this.age);
    }

    /**
     * @return String containing the song tittle and the author details
     */
    public String getSongTitleAndAuthorDetails() {
        return String.format("Song title: %s by %s", this.song.getTitle(), this.getAuthorDetails());
    }

    /**
     * @return reference to the Song object
     */
    public Song getSong() {
        return this.song;
    }


    /**
     * @param age integer
     * @return true if age is in valid range
     */
    private boolean isValidAge(int age) {
        return age >= 0 && age <= 100;
    }


    /**
     * @param age integer value for age field to be tested
     * @return the passed parameter if valid
     * @throws IllegalArgumentException if age not in range
     */
    private int ageValidator(int age) {
        if (this.isValidAge(age)) {
            return age;
        }
        throw new IllegalArgumentException("Age is not in valid range!");
    }

    /**
     * @param song
     * @return true if song is not null
     * can be extended with further logic
     */
    private boolean isValidSong(Song song) {
        return song != null;
    }

}
