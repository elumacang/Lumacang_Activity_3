package Activity3Array;

import java.util.Scanner;

/**
 * Activity 3
 * @author Lumacang
 */
public class Array {
        
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Number of players:");
        int numPlayers = scan.nextInt();
        System.out.println("");
        
        int[] score = new int[numPlayers];
        
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Enter score for player " + (i + 1) );
            score[i] = scan.nextInt();
            System.out.println("");
    }  
        
        System.out.println("Players Overall Scores:");
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Player " + (i + 1) + " / " + "Score: " + score[i]);
        }
    }
}