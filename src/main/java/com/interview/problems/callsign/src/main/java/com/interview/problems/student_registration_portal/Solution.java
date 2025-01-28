package com.interview.problems.student_registration_portal;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Solution {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        int threadsCount = parseInt(SCANNER.nextLine());
        Thread[] threads = new Thread[threadsCount];

        int expectedRegisteredStudentsCount = 0;
        for (int i = 0; i < threadsCount; i++) {
            RegistrationPortal registrationAccess = RegistrationPortal.getRegistrationPortal();
            int studentsCount = Integer.parseInt(SCANNER.nextLine());
            expectedRegisteredStudentsCount += studentsCount;
            threads[i] = new Thread(new RegistrationRunnable(registrationAccess, studentsCount, String.valueOf(i + 1)));
        }
        for (int i = 0; i < threadsCount; i++) {
            threads[i].start();
        }
        for (int i = 0; i < threadsCount; i++) {
            threads[i].join();
        }
        RegistrationPortal registrationAccess = RegistrationPortal.getRegistrationPortal();
        List<Student> registeredStudents = registrationAccess.getRegisteredStudents();

        if (registeredStudents.size() != expectedRegisteredStudentsCount) {
            System.out.println("Wrong Answer");
        } else {
            boolean correct = true;
            for (Student student : registeredStudents) {
                if (student == null) {
                    correct = false;
                    System.out.println("Wrong Answer");
                } else {
                    String studentId = student.getId();
                    String studentName = student.getName();
                    if (studentId == null || studentName == null) {
                        correct = false;
                        System.out.println("Wrong Answer");
                    }
                }
                if (!correct) {
                    break;
                }
            }
            if (correct) {
                class StudentComparator implements Comparator<Student> {
                    @Override
                    public int compare(Student first, Student second) {
                        int firstStudentNumericId = Integer.parseInt(first.getId().split("-")[2]);
                        int secondStudentNumericId = Integer.parseInt(second.getId().split("-")[2]);
                        if (firstStudentNumericId == secondStudentNumericId) {
                            int firstStudentNumericIdPrefix = Integer.parseInt(first.getId().split("-")[1]);
                            int secondStudentNumericIdPrefix = Integer.parseInt(second.getId().split("-")[1]);

                            return firstStudentNumericIdPrefix - secondStudentNumericIdPrefix;
                        }
                        return firstStudentNumericId - secondStudentNumericId;
                    }
                }
                Collections.sort(registeredStudents, new StudentComparator());
                System.out.println(registeredStudents.size());
                for (Student student : registeredStudents) {
                    String studentId = student.getId();
                    String studentName = student.getName();
                    System.out.println(studentId + " " + studentName);
                }
            }
        }
    }
}
