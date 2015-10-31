import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *     Square Tester
 * @author Cameron Kelliher
 */

public class TestSquare {
    public static void main(String[] args) throws IOException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the name of your data file:");
        String file = userInput.nextLine();
        Scanner s = new Scanner(new File(file));

        for(int a = 1; s.hasNext(); a++) {
            System.out.println("*** Square #" + a + " ***" );
            int size = s.nextInt();
            Square square = new Square(size);
            square.readSquare(s);
            System.out.println(square.toString());

            for(int b = 0; b < size; b++) {
                System.out.println("Sum for row " + b + ": " + square.totalRow(b));
            }
            for(int b = 0; b < size; b++) {
                System.out.println("Sum for column " + b + ": " + square.totalColumn(b));
            }
            System.out.println("Sum of main diagonal: " + square.totalDiagonal(1));
            System.out.println("Sum of main diagonal: " + square.totalDiagonal(2));
            System.out.println("\nMagic Square: " + square.isMagicSquare() + "\n");

        }
    }
}
