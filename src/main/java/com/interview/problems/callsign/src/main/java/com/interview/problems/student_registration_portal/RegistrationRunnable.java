package com.interview.problems.student_registration_portal;

public class RegistrationRunnable implements Runnable {
    private final RegistrationPortal registration;
    private final int studentsCount;
    private final String studentsIdPrefix;

    public RegistrationRunnable(RegistrationPortal registration, int studentsCount, String studentsIdPrefix) {
        this.registration = registration;
        this.studentsCount = studentsCount;
        this.studentsIdPrefix = studentsIdPrefix;
    }


    @Override
    public void run() {
        RegistrationHelper registrationHelper = new RegistrationHelper(registration);
        for (int i = 1; i < studentsCount; i++) {
            String studentId = "id-" + studentsIdPrefix + "-" + i;
            String studentName = "name-" + i;
            Student student = new Student(studentId, studentName);
            registrationHelper.register(student);
        }
    }
}
