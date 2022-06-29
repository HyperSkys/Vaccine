package dev.hyperskys.vaccine;

import dev.hyperskys.vaccine.data.impl.KeyVerification;

public class Vaccine {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) throws InterruptedException {
        writeScreen(ANSI_WHITE + "------------------------\n", 50);
        writeScreen(ANSI_BLUE + "Covid 19 Vaccine - v1.0.0\n", 50);
        writeScreen(ANSI_PURPLE + "Author: McDonald's#0001\n", 50);
        writeScreen(ANSI_WHITE + "------------------------\n\n", 50);
        writeScreen(ANSI_GREEN + "Checking your computer for Covid-19...\n", 50);
        Thread.sleep(4000);
        writeScreen(ANSI_RED + "Covid-19 was found on your computer, removing it...\n", 50);
        Thread.sleep(5000);
        writeScreen(ANSI_YELLOW + "Covid-19 was unable to be removed from your computer...\n", 50);
        writeScreen(" \n", 0);
        writeScreen(ANSI_RED + "Please pay 0.69 BTC to 489e382dh32d9832uduh3h98 to disinfect your computer.\n", 50);
        writeScreen(ANSI_RED + "Failure to pay will result in all files being lost.\n", 50);
        Thread.sleep(7000);
        writeScreen(" \n", 0);
        writeScreen(ANSI_GREEN + "Please input your employee key, to access our secrets.\n", 50);
        writeScreen(ANSI_RED + "Getting this wrong, will close the application.\n" + ANSI_WHITE, 50);
        new KeyVerification().prompt();
    }

    public static void writeScreen(String text, int speed) throws InterruptedException {
        for(int i = 0; i < text.length(); i++) {
            System.out.printf("%c", text.charAt(i));
            Thread.sleep(speed);
        }
    }
}