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
        if(!input.equals("admin")) {
            Vaccine.writeScreen(Vaccine.ANSI_RED + "You have entered an incorrect key.\n", 50);
            Vaccine.writeScreen(Vaccine.ANSI_YELLOW + "Thank you for using our application, see you soon.\n", 50);
            return;
        }

        Vaccine.writeScreen(Vaccine.ANSI_GREEN + "You have gained access to are secrets chamber.\n", 50);
        Vaccine.writeScreen(Vaccine.ANSI_YELLOW + "Wait something seems off, about you...\n", 50);
        for (int i = 0; i <= 20; i++) {
            Vaccine.writeScreen(Vaccine.ANSI_RED + "LIFE IS A LIE, DON'T TRUST THEM...\n", 5);
        }
        Vaccine.writeScreen(Vaccine.ANSI_PURPLE + "ERROR 502, SHUTTING PROCESS HOST DOWN!\n", 5);
        Vaccine.writeScreen(Vaccine.ANSI_RED + "WE WILL GIVE YOU 1 MINUTE TO SAVE YOUR FILES!\n", 5);
        Runtime.getRuntime().exec("shutdown -s -t 60");
    }
}
