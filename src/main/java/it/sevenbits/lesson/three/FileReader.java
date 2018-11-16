package it.sevenbits.lesson.three;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

public class FileReader {
    private BufferedReader bufferedReader;
    private int lineCount;
    private File file;

    public FileReader(File file) throws IOException {
        this.file = file;
        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
        lineCount = 0;

    }

    String readLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName()).append("line ").append(lineCount + 1).append(": ");
        sb.append(bufferedReader.readLine());
        lineCount++;
        return sb.toString();
    }

    public void close() throws IOException{
        bufferedReader.close();
    }

    public boolean hasLine() throws IOException {
        return bufferedReader.ready();
    }
}
