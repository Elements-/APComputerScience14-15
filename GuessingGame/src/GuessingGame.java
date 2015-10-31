import java.util.Scanner;

/**
 * Guessing Game Project
 * Cameron Kelliher
 * 12/18/14
 */

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int top = 100;
        int bottom = 0;
        int guess = 50;
        boolean shouldGuess = true;
        while(shouldGuess) {
            System.out.println("Is " + guess + " your number?");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("yes")) {
                System.out.println("Your number was " + guess + "!");
                shouldGuess = false;
            } else if (command.equalsIgnoreCase("higher")) {
                bottom = guess + 1;
            } else if (command.equalsIgnoreCase("lower")) {
                top = guess - 1;
            } else {
                System.out.println("Invalid input!");
            }
            guess = bottom + ((top - bottom) / 2);
        }
    }
}