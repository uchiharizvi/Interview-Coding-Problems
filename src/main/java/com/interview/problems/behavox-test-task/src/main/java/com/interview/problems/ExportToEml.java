package com.interview.problems;

import com.aspose.email.EmlLoadOptions;
import com.aspose.email.MailMessage;
import com.aspose.email.SaveOptions;

public class ExportToEml {
    public void export() {

        String dataDir = Utils.getSharedDataDir(ExportToEml.class);
        MailMessage eml = MailMessage.load(dataDir + "test-A.mbox", new EmlLoadOptions());

        eml.save(dataDir + "testEMl_out.eml", SaveOptions.getDefaultEml());
    }

}
