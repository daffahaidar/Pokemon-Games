package com.logic;

import com.pokemon.*;
import java.util.Scanner;

//
public class Battle {
    // battle 2 pokemon
    static Scanner input = new Scanner(System.in);

    public static void battle(Pokemon player1, Pokemon player2) {
        int choiceMenu;
        do {
            Console.clearScreen();
            System.out.println("========================");
            System.out.println("        Menu            ");
            System.out.println("========================\n");
            System.out.println("1. Pokemon Battle");
            System.out.println("2. Pokemon Info");
            System.out.println("3. Train your Pokemon");
            System.out.println("4. Rechoose Pokemon");
            System.out.print("Choose an option: ");
            choiceMenu = input.nextInt();

            switch (choiceMenu) {
                case 1:
                    do {
                        System.out.println("\nPick a move!");
                        System.out.println("1. Attack");
                        System.out.println("2. Heal");
                        System.out.println("3. Surrender");
                        int choice = input.nextInt();
                        if (choice == 1) {
                            // attack
                            System.out.println("You attacked " + player2.getName().get(0) + "!");
                            int damage = player1.getAttack() - player2.getDeffense();
                            if (damage < 0) {
                                damage = 0;
                            }
                            player2.sethealth(player2.getHealth() - damage);
                            System.out.println(player2.getName().get(0) + " lost " + damage + " health!");
                            System.out.println(
                                    player2.getName().get(0) + " has " + player2.getHealth() + " health left!");
                            if (player2.getHealth() <= 0) {
                                System.out.println(player2.getName().get(0) + " fainted!");
                                System.out.println(player1.getName().get(0) + " gained " + player2.getExp() + " exp!");
                                player1.setExp(player1.getExp() + player2.getExp());
                                System.out.println(player1.getName().get(0) + " has " + player1.getExp() + " exp!");
                                System.out
                                        .println(player1.getName().get(0) + " gained " + player2.getHealth()
                                                + " health!");
                                player1.sethealth(player1.getHealth() + player2.getHealth());
                                System.out
                                        .println(player1.getName().get(0) + " has " + player1.getHealth() + " health!");
                                System.out.println("You won!");
                                break;
                            }
                            System.out.println(player1.getName().get(0) + " attacked " + player2.getName().get(0) + "!");
                            damage = player2.getAttack() - player1.getDeffense();
                            if (damage < 0) {
                                damage = 0;
                            }
                            player1.sethealth(player1.getHealth() - damage);
                            System.out.println(player1.getName().get(0) + " lost " + damage + " health!");
                        } else if (choice == 2) {
                            // heal
                            System.out.println("You healed " + player1.getName().get(0) + "!");
                            int heal = player1.getHealth();
                            player1.sethealth(player1.getHealth() + heal);
                            System.out.println(player1.getName().get(0) + " gained " + heal + " health!");
                            System.out.println(player1.getName().get(0) + " has " + player1.getHealth() + " health!");
                            System.out
                                    .println(player1.getName().get(0) + " attacked " + player2.getName().get(0) + "!");
                            int damage = player2.getAttack() - player1.getDeffense();
                            if (damage < 0) {
                                damage = 0;
                            }
                            player1.sethealth(player1.getHealth() - damage);
                            System.out.println(player1.getName().get(0) + " lost " + damage + " health!");
                        } else if(choice == 3){
                            System.out.println("You surrendered!");
                            System.out.println("You lost!");
                            break;
                        }
                    } while (player1.getHealth() > 0 && player2.getHealth() > 0);

                    // check result
                    if (player1.getHealth() <= 0) {
                        System.out.println("Player 2 wins!");
                    } else if (player2.getHealth() <= 0) {
                        System.out.println("Player 1 wins!");
                    } else {
                        System.out.println("It's a draw!");
                    }
                    Console.pause();
                    break;
                case 2:
                    Console.clearScreen();
                    System.out.println("\nYour Pokemon Stats:");
                    player1.showStats();
                    Console.pause();
                    break;
                case 3:
                    // train pokemon player 1
                    Console.clearScreen();
                    System.out.println("\nYour Pokemon Stats:");
                    player1.showStats();
                    System.out.println("\nTrain your Pokemon!");
                    System.out.println("1. Attack");
                    System.out.println("2. Deffense");
                    int choice = input.nextInt();
                    if (choice == 1) {
                        player1.setAttack(player1.getAttack() + 10);
                        System.out.println("Your Pokemon gained 1 attack!");
                        Console.pause();
                    } else if (choice == 2) {
                        player1.setDeffense(player1.getDeffense() + 20);
                        System.out.println("Your Pokemon gained 1 deffense!");
                        Console.pause();
                    }
                    break;
                    

            }
        } while (choiceMenu != 4);

    }
}
