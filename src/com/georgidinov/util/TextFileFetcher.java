package com.georgidinov.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Singleton class for reading text files based of path to the file
 */
public final class TextFileFetcher {

    private TextFileFetcher() {
    }


    private static class TextFileFetcherHelper {
        private static final TextFileFetcher INSTANCE = new TextFileFetcher();
    }


    public static TextFileFetcher getInstance() {
        return TextFileFetcherHelper.INSTANCE;
    }

    public String getFileText(Path path) {
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(Files.newBufferedReader(path))) {
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine()).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Exception while reading the text file: " + e.getMessage());
        }
        return stringBuilder.toString();
    }

}//end of class TextFileFetcher
