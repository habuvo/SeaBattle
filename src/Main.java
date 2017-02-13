import java.util.Scanner;

/**
 * Created by Мы on 13.02.2017.
 */

public class Main {

    public static void main(String[] args) {

        final int DIMENSION = 10;
        final int TOTAL_SHIPS = 10;
        final int SHIPS_1 = 4;
        final int SHIPS_2 = 3;
        final int SHIPS_3 = 2;
        final int SHIPS_4 = 1;

        String playerName;

        Scanner inp = new Scanner(System.in);
        System.out.println("Hi! What is your name?");
        playerName = inp.next();


        Game game = new Game(DIMENSION);
    }
}
