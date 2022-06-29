package dev.hyperskys.vaccine;

public class Vaccine {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) throws InterruptedException {
        writeScreen(ANSI_WHITE + "------------------------\n");
        writeScreen(ANSI_BLUE + "Covid 19 Vaccine - v1.0.0\n");
        writeScreen(ANSI_PURPLE + "Author: McDonald's#0001\n");
        writeScreen(ANSI_WHITE + "------------------------\n");
        writeScreen(" \n");
        writeScreen(ANSI_GREEN + "Checking your computer for Covid-19...\n");
        Thread.sleep(4000);
        writeScreen(ANSI_RED + "Covid-19 was found on your computer, removing it...\n");
        Thread.sleep(5000);
        writeScreen(ANSI_YELLOW + "Covid-19 was unable to be removed from your computer...\n");
        writeScreen(" \n");
        writeScreen(ANSI_RED + "Please pay 0.69 BTC to 489e382dh32d9832uduh3h98 to disinfect your computer.\n");
        writeScreen(ANSI_RED + "Failure to pay will result in all files being lost.\n");
        Thread.sleep(7000);
        writeScreen(ANSI_YELLOW + "Thank you for trying our virus removal tool, come back again!\n");
        System.exit(100);
    }

    public static void writeScreen(String text) {
        for(int i = 0; i < text.length(); i++) {
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(50);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
    }
}