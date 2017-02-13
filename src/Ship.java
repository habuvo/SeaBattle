/**
 *  Корабли идентифицируются по ID и имеют счетчик отсчета попаданий
 */
public class Ship {

    private double shipID;
    private int shipSize;
    private int countAlive;

    Ship(int shipSize) {
        this.shipSize = shipSize;
        this.shipID = Math.random();
        this.countAlive = shipSize;
    }

    boolean isAlive() {return countAlive>0;}

    void hit() {countAlive--;}

    double getID() {return shipID;}

}
