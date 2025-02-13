package com.datastreams;

import java.io.Serializable;

public class Student implements Serializable {
    //Create private instance variables
    private int rollNumber;
    private String name;
    private double cgpa;

    // Constructor to initialize student object
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Getters for accessing student details
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return cgpa;
    }

    // Override toString for easy display of student details
    @Override
    public String toString() {
        return "Student{" + "rollNumber=" + rollNumber + ", name='" + name + '\'' + ", cgpa=" + cgpa + '}';
    }
}
