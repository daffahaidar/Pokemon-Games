package com.logic;

import java.util.Scanner;

import com.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Main.mainMenu();
    }

    public static void mainMenu() {
        Scanner input = new Scanner(System.in);
        // pick a pokemon
        Console.clearScreen();
        System.out.println("Pick a pokemon!");
        System.out.println("1. Charmander");
        System.out.println("2. Bulbasaur");
        System.out.println("3. Pikachu");
        System.out.println("4. Exit");
        var choice = input.nextInt();
        if (choice == 1) {
            Console.clearScreen();
            Pokemon p1 = new Charmander();
            Pokemon p2 = Pokebot.choice();

            Console.clearScreen();
            System.out.println("\nYour Pokemon");
            p1.showStats();

            System.out.println("\nEnemy's Pokemon");
            p2.showStats();
            Console.pause();

            Battle.battle(p1, p2);
            Console.pause();
        } else if (choice == 2) {
            Console.clearScreen();
            Pokemon p1 = new Bulbasaur();
            Pokemon p2 = Pokebot.choice();

            Console.clearScreen();
            System.out.println("\nYour Pokemon");
            p1.showStats();

            System.out.println("\nEnemy's Pokemon");
            p2.showStats();
            Console.pause();

            Battle.battle(p1, p2);
            Console.pause();
        } else if (choice == 3) {
            Console.clearScreen();
            Pokemon p1 = new Pikachu();
            Pokemon p2 = Pokebot.choice();

            Console.clearScreen();
            System.out.println("\nYour Pokemon");
            p1.showStats();

            System.out.println("\nEnemy's Pokemon");
            p2.showStats();
            Console.pause();

            Battle.battle(p1, p2);
            Console.pause();
        } else if (choice == 4) {
            Console.clearScreen();
            System.out.println("Bye!");
            Console.pause();
        } else {
            Console.clearScreen();
            System.out.println("Invalid input!");
            Console.pause();
            mainMenu();
        }
    }

}
