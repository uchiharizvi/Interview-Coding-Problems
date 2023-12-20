package com.interview.coding.companies.thoughworks;

import java.util.ArrayList;
import java.util.List;

import static com.interview.coding.companies.thoughworks.Constant.*;


public class CricketMatch {

    private int target;
    private int batsmanType;
    private List<Integer> totalRunsScored;

    public CricketMatch(Integer targetRun, Integer batsmanType) {
        this.target = targetRun;
        this.batsmanType = batsmanType;
    }

    public String playMatch(){
        int totalPlayerRun = INIT_RUNS;
        for(int i=0;i<BALLS_PER_OVER;i++){
            totalRunsScored = new ArrayList<>();
            int batsman = playBall();
            System.out.println("Batsman : " + batsman);
            int bowler = playBall();
            System.out.println("Bowler : " + bowler);
            if(batsman == bowler){
                System.out.println("Player Run : " + totalPlayerRun);
                return OUT;
            }
            totalPlayerRun = totalPlayerRun + batsman;
            System.out.println("Ball Runs : " + batsman);
            System.out.println("Player Runs : " + totalPlayerRun);
            totalRunsScored.add(totalPlayerRun);
        }

        System.out.println("Team : " + totalRunsScored);
       if (totalPlayerRun >= target) {
           return WON;
       }
        else {
            System.out.println("totalRunsScored : " + totalRunsScored);
            return LOST;
       }
    }

    private int playBall() {
        Run run = new Run();
        return run.calculateRun(batsmanType);
    }
}
