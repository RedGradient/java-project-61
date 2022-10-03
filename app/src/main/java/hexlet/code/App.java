package hexlet.code;

import java.util.Scanner;

public class App {
    private static String askForName() {
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        var name = sc.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");

        // game menu
        System.out.println("2 - Even");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");

        Scanner sc = new Scanner(System.in);
        var choice = sc.nextInt();
        System.out.println("Your choice: " + choice);

        System.out.println();

        if (choice != 0) {
            System.out.println("Welcome to the Brain Games!");

            switch (choice) {
                case 1:
                    Cli.greeting();
                case 2:
                    var name = askForName();
                    Even.play(name);
                    break;
            }

        }
    }
}