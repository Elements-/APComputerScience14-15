import java.util.Scanner;

/**
 * Strings Lab - Part 2
 * @author Cameron Kelliher
 */

public class Part2 {

    public static void main(String[] args) {

        System.out.println(palindrome("wow"));
        System.out.println(palindrome("false"));

    }

    private static boolean palindrome(String text) {
        return text.equals(reverse(text));
    }

    private static String reverse(String s) {
        String newString = "";
        for(int i = s.length(); i > 0; i = i - 1) {
            newString += s.charAt(i-1);
        }
        return newString;
    }

}
