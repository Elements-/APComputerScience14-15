import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Util cam = new Util();

        cam.p("Note: 1 = rock, 2 = paper, 3 = scissors");

        cam.p("Player #1's play?");
        int player1 = s.nextInt();

        cam.p("Player #2's play?");
        int player2 = s.nextInt();

        if(player1 == player2) {
            cam.p("Looks like we have a tie!");
        } else {
            if(player1 == 1 && player2 == 3) {
                cam.p("Player 1 wins!");
            } else if(player1 == 2 && player2 == 1) {
                cam.p("Player 1 wins!");
            } else if(player1 == 3 && player2 == 2) {
                cam.p("Player 1 wins!");
            } else {
                cam.p("Player 2 wins!");
            }
        }
    }
}