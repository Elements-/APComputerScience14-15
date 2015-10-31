import java.util.Scanner;

public class ThreeCoinFlip {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Util cam = new Util();

        cam.p("Note: 1 = heads, 0 = tails");

        cam.p("First players coin?");
        int player1 = s.nextInt();

        cam.p("Second players coin?");
        int player2 = s.nextInt();

        cam.p("Third players coin?");
        int player3 = s.nextInt();

        if(player1 == player2 && player2 == player3) {
            cam.p("Looks like we have a tie!");
        } else {
            if(player1 == player2) {
                cam.p("Player 3 wins!");
            }
            if(player1 == player3) {
                cam.p("Player 2 wins!");
            }
            if(player3 == player2) {
                cam.p("Player 1 wins!");
            }
        }

    }
}
