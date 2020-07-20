package L11.domain;

import java.util.concurrent.Semaphore;

public class PassengersDock implements Runnable {
    public Ship ship;

    public static final int PASSANGER_DOCKING_PLACES = 3;

    public static final boolean[] PASSANGER_DOCKING = new boolean[PASSANGER_DOCKING_PLACES];

    public static final Semaphore PASSANGER_SEMAPHORE = new Semaphore(PASSANGER_DOCKING_PLACES, true);

    public PassengersDock(Ship ship) {
        this.ship = ship;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    @Override
    public void run() {

    }
}
