import java.util.Scanner;

/**
 * Strings Lab - Part 4
 * @author Cameron Kelliher
 */

public class Part4 {

    public static void main(String[] args) {

        System.out.println(scroll("12345"));

    }

    private static String scroll(String text) {
        return text.substring(1) + text.charAt(0);
    }

}
