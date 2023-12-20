package com.interview.coding.practice.mvp;

import java.io.File;
import java.util.Scanner;

public class MostValuablePlayer {
    public static void main(String[] args) {
        System.out.println("Reading the inputs from text file...");
        //TODO Read from package
        File file = new File("C:\\Users\\user\\Desktop\\input.txt");
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\Z");//What does this do?
        String teamData = scanner.next();
        System.out.println(teamData);
        Player player = new Player();
        player.setName("");// add from file
        String[] playerData = teamData.split("\n");//read about delimiters
        findMvpPlayer();
    }

    private static void findMvpPlayer() {
    }
}
