package com.georgidinov.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public final class TextFileFetcher {

    //== constructors ==
    private TextFileFetcher() {
    }//end of constructor


    //== helper inner class ==
    private static class TextFileFetcherHelper {
        private static final TextFileFetcher instance = new TextFileFetcher();
    }//end of helper class


    //== public methods ==
    public static TextFileFetcher getInstance() {
        return TextFileFetcherHelper.instance;
    }

    public String getFileText(Path path) {
        StringBuilder sb = new StringBuilder();
        try (Scanner scanner = new Scanner(Files.newBufferedReader(path))) {
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine()).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Exception while reading the text file: " + e.getMessage());
        }
        return sb.toString();
    }

}//end of class TextFileFetcher
