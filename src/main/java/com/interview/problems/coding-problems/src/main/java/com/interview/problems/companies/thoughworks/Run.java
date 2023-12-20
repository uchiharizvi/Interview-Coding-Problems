package com.interview.coding.companies.thoughworks;

import java.util.Random;

import static com.interview.coding.companies.thoughworks.Constant.*;


public class Run {
    public Integer calculateRun(int batsmanType) {
        Random random = new Random();
        if (batsmanType == 0) {
            return random.nextInt(END_RANGE);
        } else if (batsmanType == 1) {
            return START_RANGE + random.nextInt((END_RANGE - START_RANGE) / 2) * 2;
        } else {
           int run = random.nextInt(END_RANGE_DEFENDERS);
           if(run == 2) {
               run += 1;
           }
           return run;
        }
    }
}
