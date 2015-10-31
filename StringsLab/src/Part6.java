import java.util.Scanner;

/**
 * Strings Lab - Part 6
 * @author Cameron Kelliher
 */

public class Part6 {

    public static void main(String[] args) {

        System.out.println(reverse("CAMERON"));

    }

    public static String reverse(String word) {
        String reverse = new String();
        for(int x = word.length(); 1 <= x; x--) {
            reverse += word.charAt(x-1);
        }
        return reverse;
    }

}
