package com.sumanth.java.java8.ch30serialization;

import java.io.*;

//Serialization: transform obj into byte form
//java.io.Serialization marker interface
//only instance members saved
//use transient to skip any instance member
//child class of serializable class is also serializable
//instance member type must be serializable
//constructor won't be called in deserialization
public class Invoker {
    public static void main(String[] args) {

        try (FileOutputStream fileOutputStream = new FileOutputStream("file2.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
             FileInputStream fileInputStream = new FileInputStream("file2.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream((fileInputStream))
        ) {

            ElectricBike bike = new ElectricBike("Hero", 10.0, "black", "500W");

            objectOutputStream.writeObject(bike);

            ElectricBike electricBike = (ElectricBike) objectInputStream.readObject();
            System.out.println(electricBike);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}