package com.java;

import java.io.*;

public class FileOperations {
    public static void main(String[] args) {

    }

    public static void readFile(){
        //how to read a file
        File file = new File("/Users/sumanthreddy/Desktop/textFile.txt");
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
