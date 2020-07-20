package L11.domain;

import static L11.ShipDemo.*;
import static L11.domain.CargoDock.*;
import static L11.domain.PassengersDock.*;
import static L11.domain.PrivateDock.*;

public class Ship implements Runnable {


    private int shipNumber;

    private int weight;

    private ShipType shipType;

    public Ship(int shipNumber, int weight, ShipType shipType) {
        this.shipNumber = shipNumber;
        this.weight = weight;
        this.shipType = shipType;
    }

    public Ship() {
    }

    public int getShipNumber() {
        return shipNumber;
    }

    public void setShipNumber(int shipNumber) {
        this.shipNumber = shipNumber;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ShipType getShipType() {
        return shipType;
    }

    public void setShipType(ShipType shipType) {
        this.shipType = shipType;
    }


    @Override
    public void run() {
        try {
            OPERATOR_SEMAPHORE.acquire();
            int operator = -1;

            for (int i = 1; i <= OPERATORS_QUANTITY; i++) {
                if (!OPERATORS[i-1]) {
                    OPERATORS[i-1] = true;
                    operator = i;
                    System.out.printf("Оператор № %d обрабатывает запрос. \n", operator);
                    break;
                }
            }





            // правки на 3 порта
            if (shipType == ShipType.PRIVATE){
                try{
                    PRIVATE_SEMAPHORE.acquire();

                    int dockNumber = -1;

                    for (int i = 0; i < PRIVATE_DOCKING_PLACES ; i++) {
                        if (!PRIVATE_DOCKING[i]){
                            PRIVATE_DOCKING[i] = true;
                            dockNumber = i;
                            Thread.sleep(500);
                            System.out.printf("Корабль № %d пришвартовался в частном доке № %d \n", shipNumber, dockNumber);
                            Thread.sleep(1000);

                            OPERATORS[operator-1] = false;

                            OPERATOR_SEMAPHORE.release();
                            System.out.printf("Оператор № %d закончил обработку запроса. \n", operator);
                            break;
                        }
                    }
                    Thread.sleep(4000);
                    PRIVATE_DOCKING[dockNumber] = false;
                    PRIVATE_SEMAPHORE.release();
                    System.out.printf("Корабль № %d покинул частный док. \n", shipNumber);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else if(shipType == ShipType.CARGO){
                try{
                    CARGO_SEMAPHORE.acquire();

                    int dockNumber = -1;

                    for (int i = 0; i < CARGO_DOCKING_PLACES ; i++) {
                        if (!CARGO_DOCKING[i]){
                            CARGO_DOCKING[i] = true;
                            dockNumber = i;

                            Thread.sleep(500);
                            System.out.printf("Корабль № %d пришвартовался в грузовом доке № %d \n", shipNumber, dockNumber);
                            Thread.sleep(1000);

                            OPERATORS[operator-1] = false;

                            OPERATOR_SEMAPHORE.release();
                            System.out.printf("Оператор № %d закончил обработку запроса. \n", operator);
                            break;
                        }
                    }
                    CARGO_DOCKING[dockNumber] = false;
                    CARGO_SEMAPHORE.release();
                    System.out.printf("Корабль № %d покинул грузовой док. \n", shipNumber);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try{
                    PASSANGER_SEMAPHORE.acquire();

                    int dockNumber = -1;

                    for (int i = 0; i < PASSANGER_DOCKING_PLACES ; i++) {
                        if (!PASSANGER_DOCKING[i]){
                            PASSANGER_DOCKING[i] = true;
                            dockNumber = i;
                            Thread.sleep(500);
                            System.out.printf("Корабль № %d пришвартовался в пассажирском доке № %d. \n", shipNumber, dockNumber);
                            Thread.sleep(1000);

                            OPERATORS[operator-1] = false;

                            OPERATOR_SEMAPHORE.release();
                            System.out.printf("Оператор № %d закончил обработку запроса. \n", operator);
                            break;
                        }
                    }
                    Thread.sleep(4000);
                    PASSANGER_DOCKING[dockNumber] = false;
                    PASSANGER_SEMAPHORE.release();
                    System.out.printf("Корабль № %d покинул пассажирский док.\n", shipNumber);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }


            //конец правок на три порта




        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
