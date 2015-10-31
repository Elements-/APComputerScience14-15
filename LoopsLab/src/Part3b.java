import java.util.Scanner;

/**
 * Cameron Kelliher
 */
public class Part3b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for(int y = 1; y <= x; y++) {
            for(int i = 1; i <= 10; i++) {
                System.out.print(String.format("%-5s", y*i + " "));
            }
            System.out.println();
        }
    }
}
