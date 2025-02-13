package com.serialization;

import java.io.Serializable;
import java.util.Objects;

// Employees class must implement Serializable for serialization to work
public class Employees implements Serializable {
    private static final long serialVersionUID = 1L; // Added to ensure version compatibility

    String id; // Employee ID
    String name; // Employee name
    String department; // Employee department
    double salary; // Employee salary

    // Constructor to initialize employee object
    public Employees(String id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Override toString method to print employee details
    @Override
    public String toString() {
        return "Employee ID=" + id + "\nName='" + name + "'\nDepartment='" + department + "'\nSalary=" + salary;
    }

    // Override equals method to compare employees
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employee = (Employees) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(id, employee.id) &&
                Objects.equals(name, employee.name) &&
                Objects.equals(department, employee.department);
    }

    // Override hashCode method for hashing
    @Override
    public int hashCode() {
        return Objects.hash(id, name, department, salary);
    }
}
