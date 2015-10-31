import java.util.Scanner;

/**
 * Strings Lab - Part 1
 * @author Cameron Kelliher
 */

public class Part1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Input some text, press enter when you are done.");
        String text = s.nextLine();

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
    }

}
