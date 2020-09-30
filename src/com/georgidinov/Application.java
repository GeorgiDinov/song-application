package com.georgidinov;

import com.georgidinov.util.TextFileFetcher;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Application {

    public static void main(String[] args) {

        Author author = new Author();
        Song song = author.getSong();
        String genreMetal = "metal";
        String genrePop = "pop";
        System.out.print("Song object print = "+song);
        System.out.println();
        System.out.println("\t\t\t<<<Song Methods Test Output>>>");
        System.out.println(song.getSongDetails());
        System.out.println("The song genre is metal = " + song.isTheSongGenreSameAs(genreMetal));
        System.out.println("The song genre is pop = " + song.isTheSongGenreSameAs(genrePop));
        System.out.println("Song duration: " + song.getSongTimingString());
        System.out.println("Song Lyrics: " + song.getSongLyrics());

        System.out.println("\n\t\t\t<<<Author Methods Test Output>>");
        System.out.println("Author Details: " + author.getAuthorDetails());
        System.out.println("Song Title And Author Details: " + author.getSongTitleAndAuthorDetails());

        System.out.println("\n\t\t\t<<<AnotherSong Test For FileFetcher Lyrics File Loading>>>");
        String fileName = "sadbuttrue.txt";
        Path path = FileSystems.getDefault().getPath(fileName);
        Song anotherSong = null;
        if (Files.exists(path)) {
            anotherSong = new Song("Sad But True", "metal", 6.36d, TextFileFetcher.getInstance().getFileText(path));
        }
        if (anotherSong != null) {
            System.out.println(anotherSong.getSongLyrics());
        }

    }

}
