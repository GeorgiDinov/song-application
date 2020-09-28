package com.georgidinov;

//        2. Създайте клас `Author`. Създайте няколко член-променливи,
//        като прецените сами какъв тип трябва да бъдат
//        -	`name` - името на изпълнителя
//        -	`age` - възраст на изпълнителя
//        -	`song` - песента на изпълнителя
//        Напишете метод, който да извежда в конзолата форматирано
//        името на автора и неговата възраст.
//        Напишете метод, който да извежда в конзолата форматирано
//        заглавието на песента и автора.

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

    //== fields ==
    private String name;
    private int age;
    private Song song;

    //== constructors ==
    public Author() {
        this("Metallica", 38, new Song());
    }//end of constructor

    public Author(String name, int age, Song song) {
        this.name = Objects.requireNonNull(name, "DefaultName");
        if (this.isValidAge(age)) {
            this.age = age;
        } else {
            this.age = -1;
        }
        if (this.isValidSong(song)) {
            this.song = song;
        } else {
            this.song = new Song();
        }
    }//end of constructor


    //== public methods ==
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
        return "Song: " + this.song.getTitle() + " by " + this.getAuthorDetails();
    }

    /**
     * @return reference to the Song object
     */
    public Song getSong() {
        return this.song;
    }



    //== private methods ==
    /**
     * @param age integer
     * @return true if age is in valid range
     */
    private boolean isValidAge(int age) {
        return age >= 0 && age <= 100;
    }

    //checks the Song object in this case only if it's not null, may be extended as needed

    /**
     * @param song
     * @return true if song is not null
     * can be extended with further logic
     */
    private boolean isValidSong(Song song) {
        return song != null;
    }

}//end of class Author
