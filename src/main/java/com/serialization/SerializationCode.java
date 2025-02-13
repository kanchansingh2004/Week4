package com.serialization;

import java.io.*;
import java.util.List;

public class SerializationCode {
    // Method to serialize and write a list of employees to a file
    public static void readWrite(String path, List<Employees> li) {
        try (FileOutputStream fs = new FileOutputStream(path);
             ObjectOutputStream oos = new ObjectOutputStream(fs)) {
            oos.writeObject(li); // Write object to the file
            oos.flush(); // Ensure data is written
        } catch (IOException e) {
            throw new RuntimeException("Error during serialization: " + e.getMessage());
        }
    }

    // Method to deserialize and read a list of employees from a file
    public static List<Employees> readFromFile(String path) {
        try (FileInputStream fis = new FileInputStream(path);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (List<Employees>) ois.readObject(); // Read and return object
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error while reading from file: " + e.getMessage());
        }
        return null; // Return null if an error occurs
    }
}
