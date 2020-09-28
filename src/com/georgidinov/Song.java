package com.georgidinov;

//        1. Създайте клас `Song`. Създайте няколко член-променливи,
//        като прецените сами какъв тип трябва да бъдат
//        -	`title` - заглавие на песента
//        -	`genre` - жанр
//        -	`timing` - времетраене на песента
//        -	`lyrics` - текст на песента
//        Напишете метод, който да извежда в конзолата характеристиките на класа.
//        Напишете метод, който проверява дали подаден жанр, отговаря на този на песента.
//        Напишете метод, който извежда в конзолата времетраенето на песента.
//        Напишете метод, който извежда в конзолата текста на песента.

import java.util.Objects;

public class Song {

    //== fields ==
    private String title;
    private String genre;
    private double timing;
    private String lyrics;


    //== constructors ==
    public Song() {
        this("Sad But True", "Metal", 6.36d, "SadButTrueLyrics");
    }//end of constructor

    public Song(String title, String genre, double timing, String lyrics) {
        this.title = Objects.requireNonNull(title, "DefaultTitle");
        this.genre = Objects.requireNonNull(genre, "DefaultGenre");
        if (this.isValidTiming(timing)) {
            this.timing = timing;
        } else {
            this.timing = 0.0d;
        }
        this.lyrics = Objects.requireNonNull(lyrics, "DefaultLyrics");
    }//end of constructor


    //== public methods ==

    //auto generated toString method for the Song object details
    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", timing=" + timing +
                ", lyrics='" + lyrics + '\'' +
                '}';
    }

    //checks for string equality ignoring the case
    public boolean isTheSongGenreSameAs(String genre) {
        if (this.isValidGenre(genre)) {
            return this.genre.equalsIgnoreCase(genre);
        }
        return false;
    }

    //returns the song object duration formatted with 2 digits after the floating point
    public String getSongTimingString() {
        return String.format("%.2f", this.timing);
    }

    //getter for the lyrics field
    public String getSongLyrics() {
        return this.lyrics;
    }

    //== getter for the tittle field
    public String getTitle() {
        return title;
    }

    //== private methods ==
    //checks for the song duration to be grater than 0
    private boolean isValidTiming(double timing) {
        return timing > 0d;
    }

    //checks if the passed parameter is not null , empty or blank
    private boolean isValidGenre(String genre) {
        return genre != null && !genre.isBlank();
//        return genre!=null&&!genre.isEmpty(); if not compatible with java version
    }

}//end of class Song
