package main.java.Template_Method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("how many players?");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();


        Game countingGame = new HighestNumberGame();
        countingGame.play(amount);
        
    }
    
}
