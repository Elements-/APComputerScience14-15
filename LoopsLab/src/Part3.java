import java.util.Scanner;

/**
 * Cameron Kelliher
 */
public class Part3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.print(i*x + " ");
        }
    }
}
