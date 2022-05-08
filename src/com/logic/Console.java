package com.logic;

import java.util.Scanner;

public class Console {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void pause() {
        Scanner pause = new Scanner(System.in);
        pause.nextLine();
    }
}
