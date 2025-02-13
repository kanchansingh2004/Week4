package com.serialization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.serialization.SerializationCode.readFromFile;
import static com.serialization.SerializationCode.readWrite;

public class Main {
    public static void main(String[] args) {
        // Define the file path where data will be serialized
        String path = "D:\\Training_Capgemini\\Week4\\Day3\\src\\main\\java\\com\\serialization\\Display.txt";

        // Create employee objects
        Employees e1 = new Employees("2111", "Bhanu", "Manager", 20000.0);
        Employees e2 = new Employees("2232", "Aditya", "Manager", 20000.0);
        Employees e3 = new Employees("2142", "peechu", "Manager", 20000.0);

        // Add employees to a list
        List<Employees> li = new ArrayList<>(Arrays.asList(e1, e2, e3));

        // Serialize the list of employees to a file
        readWrite(path, li);

        // Deserialize the list of employees from the file
        List<Employees> deserial = readFromFile(path);

        // Print the deserialized list of employees
        if (deserial != null) {
            for (Employees e : deserial) {
                System.out.println(e);
            }
        }
    }
}
