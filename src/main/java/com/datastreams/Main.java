package com.datastreams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // File path to store student details
        String filePath = "D:\\Training_Capgemini\\Week4\\Day3\\src\\main\\java\\com\\datastreams\\details.txt";

        // Create a list of details.txt
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Simmy", 3.8));
        students.add(new Student(102, "bunny", 3.6));
        students.add(new Student(103, "Chandler", 3.9));

        // Store student details in the binary file
        StudentDataHandler.storeStudentDetails(filePath, students);

        // Retrieve student details from the binary file
        List<Student> retrievedStudents = StudentDataHandler.retrieveStudentDetails(filePath);

        // Display the retrieved student details
        for (Student student : retrievedStudents) {
            System.out.println(student);
        }
    }
}
