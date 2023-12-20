package com.interview.problems;

import com.aspose.email.FileFormatInfo;
import com.aspose.email.FileFormatUtil;

public class EmailReader {
    public void readEmail(String directory) throws Exception {
        ExportToEml export = new ExportToEml();
        detectFileFormat(directory);

        /*for(final File fileEntry:folder.listFiles()){
            int index = fileEntry.getName().lastIndexOf('.');
            if(index>0){
                String extension = fileEntry.getName().substring(index+1);
                if(extension.equalsIgnoreCase("mbox")){
                    *//*BufferedReader br = new BufferedReader(fileEntry.);*//*
                    try {
                        //FileStream stream = new FileStream(fileEntry.getName(), FileMode.Open, FileAccess.Read);
                        export.export();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }else{
                    throw new Exception("File Extension Incorrect");
                }
            }*/
            /*System.out.println(fileEntry.getName());
            FileStream fileStream = new FileStream(fileEntry.getName(), FileMode.Open, FileAccess.Read);
            EmailConverter converter = new EmailConverter();
            converter.convert(fileStream);*/
        }
        private void detectFileFormat(String directory){
            FileFormatInfo info = FileFormatUtil.detectFileFormat(directory + "test-A.mbox");
            System.out.println(info.getFileFormatType());
    }

}
