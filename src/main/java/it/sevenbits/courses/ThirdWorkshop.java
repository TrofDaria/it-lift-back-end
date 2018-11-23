package it.sevenbits.courses;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;

public class ThirdWorkshop {
    public static void main(String[] args){
        try {
            taskOne(args[0], args[1]);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void taskOne(String dirName, String outFileName) throws IOException {
        File dir = new File(dirName);
        File[] files = dir.listFiles();
        File outFile = new File(".", outFileName);
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter( new FileOutputStream(outFile), StandardCharsets.UTF_8));

        for (int i = 0; i< files.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(files[i].getName()).append(", ");
            if(files[i].isDirectory()){
                sb.append("dir, ");
            }else{
                sb.append("file, ");
            }
            if(Files.isReadable(files[i].toPath())){
                sb.append("r");
            }
            if(Files.isWritable(files[i].toPath())){
                sb.append("w");
            }
            if(Files.isExecutable(files[i].toPath())){
                sb.append("e");
            }
            sb.append(", ");

            sb.append(files[i].getAbsolutePath()).append("\n");
            bufferedWriter.write(sb.toString());
            if(i%5==0){
                bufferedWriter.flush();
            }
        }
        bufferedWriter.close();

    }
}
