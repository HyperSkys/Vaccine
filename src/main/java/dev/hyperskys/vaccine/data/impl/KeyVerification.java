package dev.hyperskys.vaccine.data.impl;

import dev.hyperskys.vaccine.Vaccine;
import dev.hyperskys.vaccine.data.Verification;

import java.io.IOException;
import java.util.Scanner;

public class KeyVerification implements Verification {
    @Override
    public void prompt() throws InterruptedException, IOException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if(!input.equals("eSnExF2N6sS9DtbkxrT6")) {
            System.in.close();
            Vaccine.writeScreen(Vaccine.ANSI_RED + "\nYou have entered an incorrect key.\n", 50);
            Vaccine.writeScreen(Vaccine.ANSI_YELLOW + "Thank you for using our application, see you soon.\n", 50);
            return;
        }

        System.in.close();
        Vaccine.writeScreen(Vaccine.ANSI_YELLOW + "\nWelcome, Satoshi Nakamoto...\n", 30);
        Vaccine.writeScreen(Vaccine.ANSI_GREEN + "Give us a second as we authenticate you.\n", 30);
        Thread.sleep(5000);
        Vaccine.writeScreen(Vaccine.ANSI_RED + "We are enduring some issues, give us a moment.\n", 40);
        Thread.sleep(10000);
        Vaccine.writeScreen(Vaccine.ANSI_YELLOW + "Wait something seems off, about you...\n\n", 50);
        for (int i = 0; i <= 20; i++) {
            Vaccine.writeScreen(Vaccine.ANSI_RED + "LIFE IS A LIE, DON'T TRUST THEM...\n", 5);
        }
        Vaccine.writeScreen(Vaccine.ANSI_PURPLE + "\nERROR 404, SHUTTING PROCESS HOST DOWN!\n", 5);
        Vaccine.writeScreen(Vaccine.ANSI_RED + "WE WILL GIVE YOU 1 MINUTE TO SAVE YOUR FILES!\n", 5);
        // Runtime.getRuntime().exec("shutdown -s -t 60"); -- Shuts down the host computer (Don't use for testing) \\
        System.exit(404);
    }
}
