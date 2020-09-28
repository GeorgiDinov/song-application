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

    //returns string containing data for the name and age of the author
    public String getAuthorDetails() {
        return String.format("Author: %s Age: %d", this.name, this.age);
        //return "Author: " + this.name + " Age: " + this.age;
    }

    //returns string containing the author song name and the author name and age
    public String getSongTitleAndAuthorDetails() {
        return "Song: " + this.song.getTitle() + " by " + this.getAuthorDetails();
    }

    //getter for the Song field
    public Song getSong() {
        return this.song;
    }


    //== private methods ==

    //checks for valid age range
    private boolean isValidAge(int age) {
        return age >= 0 && age <= 100;
    }

    //checks the Song object in this case only if it's not null, may be extended as needed
    private boolean isValidSong(Song song) {
        return song != null;
    }

}//end of class Author
