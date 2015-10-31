import java.util.Scanner;

/**
 * Cameron Kelliher
 */
public class Part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int amount = 1;
        for(int i = 1; i <= max; i++) {
            amount*=i;
        }
        System.out.println(amount);
    }
}
