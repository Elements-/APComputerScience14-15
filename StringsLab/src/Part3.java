import java.util.Scanner;

/**
 * Strings Lab - Part 3
 * @author Cameron Kelliher
 */

public class Part3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Input a word, press enter when you are done.");
        String text = s.nextLine();

        System.out.println(text.substring(1) + text.charAt(0) + "ay");
    }

}
