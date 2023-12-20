package com.interview.coding.companies.thoughworks;

import java.util.Scanner;

import static com.interview.coding.companies.thoughworks.Constant.*;


//TODO: Refactor-Single Responsibility classes
public class CricketGame {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CricketMatch match;

        System.out.println("Input...");

        System.out.println("Enter the Score to chase...:");
        Integer targetRun = scan.nextInt();//12 for example

        for (int playerSeq = STARTING_PLAYER; playerSeq < TOTAL_PLAYERS; playerSeq++) {

            System.out.println("Enter Batsman Type : ");
            Integer batsmanType = scan.nextInt();

            match = new CricketMatch(targetRun, batsmanType);

            String finalResult = match.playMatch();
            if (finalResult.equals(LOST)) {
                System.out.println(finalResult);
            } else {
                System.out.println(finalResult);
            }
        }
    }

}

