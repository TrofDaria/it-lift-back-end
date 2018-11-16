package it.sevenbits.lesson.three;

import java.io.IOException;

public class Example {
    int getLongestLineCharsCount(FileReader fileReader) throws IOException {
        int longestLineCount = 0;
        String tmpLine;
        while (fileReader.hasLine()) {
            tmpLine = fileReader.readLine();
            if (longestLineCount < tmpLine.length()) {
                longestLineCount = tmpLine.length();
            }
        }
        return longestLineCount;
    }
}
