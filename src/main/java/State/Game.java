package main.java.State;

import java.util.Scanner;

public class Game {
    private Character hero;

    public Game() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your hero's name:");
        String heroName = scanner.nextLine();
        this.hero = new Character(heroName);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Hero Training Game!");
        System.out.println("Your hero's name is: " + hero.getName());

        while (true) {
            printHeroStats();


            System.out.println("What would you like to do?");
            System.out.println("1. Train");
            System.out.println("2. Meditate");
            System.out.println("3. Fight");
            System.out.println("4. Quit");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();


            switch (choice) {
                case "1":
                    hero.train();
                    break;
                case "2":
                    hero.meditate();
                    break;
                case "3":
                    hero.fight();
                    break;
                case "4":
                    System.out.println("Thanks for playing! Goodbye.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }


            if (hero.isDead()) {
                System.out.println("Your hero has died. Game over!");
                break;
            }
            if (hero.isMaster()) {
                System.out.println("Congratulations! Your hero has become a Master. You win!");
                break;
            }
        }

        scanner.close();
    }

    private void printHeroStats() {
        System.out.println("\nHero Stats:");
        System.out.println("Name: " + hero.getName());
        System.out.println("XP: " + hero.getXP());
        System.out.println("HP: " + hero.getHP() + "/" + hero.getMaxHp());
        System.out.println("Current State: " + hero.getStateName());
        System.out.println();
    }
}
