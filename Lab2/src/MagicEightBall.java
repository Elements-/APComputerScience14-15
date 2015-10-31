import java.util.*;

public class MagicEightBall {

    public static void main(String args[]) {
        Random randoms = new Random();
        int r = randoms.nextInt(4) + 1;

        switch (r) {
            case 1:
                System.out.println("Your going to have a great day!");
                break;
            case 2:
                System.out.println("Your going to have a bad day!");
                break;
            case 3:
                System.out.println("Your going to have a fun day!");
                break;
            case 4:
                System.out.println("You are going to live into your hundreds");
                break;
            case 5:
                System.out.println("Your going to have a slow day!");
                break;
        }
    }
}
