/**
 * Created by Мы on 13.02.2017.
 */
public class Game {

    double[][] gameTable;

    Game(int dim) {

            gameTable = new double[dim][dim];

    }

    void mountShip(Ship ship,int x,int y,boolean vertical) {
        int a =  vertical?y:x;
        int b =  vertical?x:y;

        for (int i = 0; i < a; i++) {
            if (gameTable[b][a]!= 0D) break;
            gameTable[b][a] = ship.getID();
        }

    }
}
