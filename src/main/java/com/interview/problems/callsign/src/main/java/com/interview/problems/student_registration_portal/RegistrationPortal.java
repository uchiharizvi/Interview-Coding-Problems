package com.interview.problems.student_registration_portal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class RegistrationPortal {
    // Singleton instance
    private static volatile RegistrationPortal instance = null;

    // Thread-safe list to store registered students
    private final List<Student> registeredStudents;

    // Private constructor for Singleton pattern
    private RegistrationPortal() {
        this.registeredStudents = Collections.synchronizedList(new ArrayList<>());
    }

    // Singleton instance retrieval with double-checked locking
    public static RegistrationPortal getRegistrationPortal() {
        if (instance == null) {
            synchronized (RegistrationPortal.class) {
                if (instance == null) {
                    instance = new RegistrationPortal();
                }
            }
        }
        return instance;
    }

    // Method to register a student
    public void register(Student student) {
        if (student != null) {
            registeredStudents.add(student);
        }
    }

    // Method to retrieve registered students
    public List<Student> getRegisteredStudents() {
        synchronized (registeredStudents) {
            return new ArrayList<>(registeredStudents);
        }
    }
}
