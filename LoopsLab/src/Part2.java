import java.util.Scanner;

/**
 * Cameron Kelliher
 */
public class Part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int amount = 0;
        for(int i = 0; i <= max; i++) {
            amount+=i;
        }
        System.out.println(amount);
    }
}
