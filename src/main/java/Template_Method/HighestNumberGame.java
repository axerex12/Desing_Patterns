package main.java.Template_Method;

import java.util.HashMap;
import java.util.Scanner;

public class HighestNumberGame extends Game {
    Scanner scanner = new Scanner(System.in);
    HashMap<Integer,Integer> d = new HashMap<>();
    int numberOfPlayers;


    @Override
    public void initializeGame(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        System.out.println("Initializing Counting Game with " + numberOfPlayers + " players.");
    }

    @Override
    public boolean endOfGame() {
        return d.size() == numberOfPlayers;
    }

    @Override
    public void playSingleTurn(int player) {
        System.out.println("Player " + (player+1) + " is playing their turn.");
        System.out.println("pick a number");
        int input = scanner.nextInt();
        d.put(player, input);
    }

    @Override
    public void displayWinner() {
        System.out.println("Displaying the winner of the Counting Game.");
        int highest = 0;
        int winner = 0;

        for (int i : d.keySet()) {
            int number = d.get(i);
            if (number > highest) {
                highest = number;
                winner = i;
            }
        }

        System.out.println("Player " + (winner+1) + " is the winner with the highest number: " + highest + "!");
    }
}
