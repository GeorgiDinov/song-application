package com.georgidinov;

//Тема 1: Song Application
//        В конструктора, задайте стойности по подразбиране (вие изберете какви).
//        Избирайте подходящи имена на методите, както и подходящи типове на резултатите.
//        Създайте клас `Application`, който трябва да е стартовия файл на програмата ни.
//        Не забравяйте да оставяте коментари!
//
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
//
//        2. Създайте клас `Author`. Създайте няколко член-променливи,
//        като прецените сами какъв тип трябва да бъдат
//        -	`name` - името на изпълнителя
//        -	`age` - възраст на изпълнителя
//        -	`song` - песента на изпълнителя
//        Напишете метод, който да извежда в конзолата форматирано името на автора и неговата възраст.
//        Напишете метод, който да извежда в конзолата форматирано заглавието на песента и автора.

public class Application {

    public static void main(String[] args) {

        Author author = new Author();
        Song song = author.getSong();
        String genre = "metal";

        System.out.println("\t\t\t<<<Song Methods Test Output>>>");
        System.out.println(song);
        System.out.println("The song genre is metal = " + song.isTheSongGenreSameAs(genre));
        System.out.println("Song duration: " + song.getSongTimingString());
        System.out.println("Song Lyrics: " + song.getSongLyrics());

        System.out.println("\n\t\t\t<<<Author Methods Test Output>>");
        System.out.println("Author Details: " + author.getAuthorDetails());
        System.out.println("Song Title And Author Details: " + author.getSongTitleAndAuthorDetails());

    }//end of main method

}//end of class Application
