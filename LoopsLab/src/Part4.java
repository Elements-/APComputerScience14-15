import java.util.Scanner;

/**
 * Cameron Kelliher
 */
public class Part4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Say 'done' when you're done entering values.");
        boolean done = false;
        int total = 0, count = 0;
        while(!done) {
            String line = s.nextLine();
            if(!line.equals("done")) {
                count++;
                total += Integer.parseInt(line);
            } else {
                done = true;
                System.out.println("Average Grade: " + total/count);
            }
        }
    }
}
