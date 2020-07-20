package L11.domain;

import java.util.concurrent.Semaphore;

public class CargoDock implements Runnable{
    public Ship ship;

    public static final int CARGO_DOCKING_PLACES = 3;

    public static final boolean[] CARGO_DOCKING = new boolean[CARGO_DOCKING_PLACES];

    public static final Semaphore CARGO_SEMAPHORE = new Semaphore(CARGO_DOCKING_PLACES, true);

    public CargoDock(Ship ship) {
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
