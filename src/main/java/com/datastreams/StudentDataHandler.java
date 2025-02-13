package com.datastreams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDataHandler {

    // Method to store student details into a binary file
    public static void storeStudentDetails(String filePath, List<Student> students) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            for (Student student : students) {
                dos.writeInt(student.getRollNumber());
                dos.writeUTF(student.getName());
                dos.writeDouble(student.getGpa());
            }
            System.out.println("Student details stored successfully.");
        } catch (IOException e) {
            System.err.println("Error while storing student details: " + e.getMessage());
        }
    }

    // Method to retrieve student details from a binary file
    public static List<Student> retrieveStudentDetails(String filePath) {
        List<Student> students = new ArrayList<>();
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            // Check if more data is available to read
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double cgpa = dis.readDouble();
                students.add(new Student(rollNumber, name, cgpa)); // Add to list
            }
            System.out.println("Student details retrieved successfully.");
        } catch (IOException e) {
            System.err.println("Error while retrieving student details: " + e.getMessage());
        }
        return students;
    }
}
