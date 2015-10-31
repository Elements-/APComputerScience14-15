import java.util.Scanner;

/**
 * Strings Lab - Part 5
 * @author Cameron Kelliher
 */

public class Part5 {

    public static void main(String[] args) {
        String card = "1234 5678 9101 1213";
        System.out.println(lastFour(card));
    }

    private static String lastFour(String cardNumber) {

        return cardNumber.substring(15);

    }

}
