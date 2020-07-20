package L11.domain;

import java.util.concurrent.Semaphore;

public class PrivateDock implements Runnable {
    private Ship ship;

    public static final int PRIVATE_DOCKING_PLACES = 20;

    public static final boolean[] PRIVATE_DOCKING = new boolean[PRIVATE_DOCKING_PLACES];

    public static final Semaphore PRIVATE_SEMAPHORE = new Semaphore(PRIVATE_DOCKING_PLACES, true);

    public PrivateDock(Ship ship) {
        this.ship = ship;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public static void privateDock(Ship ship){
        ship.run();
    }

    @Override
    public void run() {

    }
}
