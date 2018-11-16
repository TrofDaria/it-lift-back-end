package it.sevenbits.lesson.three;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class JavaIOTasks {
    public static void main(String[] args) {
        File dir = new File(".");
        File file = new File(dir, "MyHomework.txt ");
        try{
            task1();
            FileReader fileReader = new FileReader(file);
            Example example = new Example();
            System.out.println(example.getLongestLineCharsCount(fileReader));
            fileReader.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    static public void task1() throws IOException {
        // пункт 4
        File dir = new File(".");
        File file = new File(dir, "MyHomework.txt ");
        file.createNewFile();

        // пункт 5
        InputStream fileInputStream = new FileInputStream(new File(dir, "Homework3.txt"));
        InputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        OutputStream fileOutputStream = new FileOutputStream(file);
        OutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        byte[] bytes = new byte[bufferedInputStream.available()];
        bufferedInputStream.read(bytes);

        bufferedOutputStream.write(bytes);

        // пункт 6
        String surname = "Трофимова";
        byte[] name = surname.getBytes(StandardCharsets.UTF_8);
        bufferedOutputStream.write(name);
        bufferedOutputStream.flush();

        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
