package L11.util;

import L11.domain.Ship;
import L11.domain.ShipType;

public class ShipUtil {
    public static ShipType defineShipType(int weight){
        int random = (int) (Math.random()*2);
        ShipType shipType;
        if (weight < 20){
            shipType = ShipType.PRIVATE;
        } else if (random == 0){
            shipType = ShipType.PASSENGER;
        } else {
            shipType = ShipType.CARGO;
        }
        return shipType;
    }

    public static Ship generateShip(int number){
        Ship ship = new Ship();
        int random = (int) ((Math.random()*250)+5);
        ship.setShipNumber(number);
        ship.setWeight(random);
        ship.setShipType(defineShipType(random));
        return ship;
    }


}
