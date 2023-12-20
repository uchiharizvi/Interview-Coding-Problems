package com.interview.problems;


import java.io.File;

public class ClientCode {
    private EmailReader emailReader;



    public static void main(String[] args) throws Exception {
        EmailReader emailReader = new EmailReader();
        String dataDir = Utils.getSharedDataDir(ExportToEml.class);
        //final File folder = new File("C:/Users/rizvi/Desktop/Behvioux - Test Task/test (1)/test/input");
        final File folder = new File("src/main/resources");
        emailReader.readEmail(dataDir);
    }
}
