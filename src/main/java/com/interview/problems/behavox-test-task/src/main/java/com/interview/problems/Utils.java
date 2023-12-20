package com.interview.problems;

import com.aspose.email.EWSClient;
import com.aspose.email.IEWSClient;
import com.aspose.email.License;

import java.io.File;

public class Utils {

    public static void applyALicense() throws Exception {
        String dataDir = getSharedDataDir(Utils.class) + "License/";
        License license = new License();
        license.setLicense(dataDir + "Aspose.Total.Java.lic");
    }

    public static String getDataDir(Class c) {
        File dir = new File(System.getProperty("user.dir"));
        dir = new File(dir, "src");
        dir = new File(dir, "main");
        dir = new File(dir, "resources");

        for (String s : c.getName().split("\\.")) {
            dir = new File(dir, s);
            if (dir.isDirectory() == false)
                dir.mkdir();
        }

        System.out.println("Using data directory: " + dir.toString());
        return dir.toString() + File.separator;
    }

    public static String getSharedDataDir(Class c) {
        File dir = new File(System.getProperty("user.dir"));
        dir = new File(dir, "src");
        dir = new File(dir, "main");
        dir = new File(dir, "resources");

        return dir.toString() + File.separator;
    }

    public static IEWSClient getAsposeEWSClient() {
        // Create instance of IEWSClient class by giving credentials
        IEWSClient client = EWSClient.getEWSClient("https://outlook.office365.com/exchangeews/exchange.asmx", "testUser", "pwd", "domain");

        // Return the instance of IEWSClient class
        return client;
    }
}