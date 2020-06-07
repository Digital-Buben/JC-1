package L3.util;

import L3.domain.Car;
import L4.domain.CarType;

import java.util.Random;

public class CarUtil {

    //CarID should be defined ONLY by computer
    static long carID = 0L;

    public static void generateCarID(Car car) {
        car.setCarID(carID);
        carID++;
    }

    public static int generateWeight() {
        return new Random().nextInt(10000) + 300;
    }

    //Car type should be defined ONLY by computer

    public static void defineType(Car car) {
        //SWICTH is not Suitable (need to create either a few booleans or create additional IF ELSE and
        //then SWITCH or generate weight 1 up to 3)
        if (car.getWeight() < 1501) {
            car.setType(CarType.PASSENGER_CAR.getTypeDescription());
        } else {
            if (car.getWeight() > 1500 && car.getWeight() < 3501) {
                car.setType(CarType.OFFROADER.getTypeDescription());
            } else {
                car.setType(CarType.TRUCK.getTypeDescription());
            }
        }
    }

    public static Car generateCar() {
        Car car = new Car();
        generateCarID(car);
        car.setWeight(generateWeight());
        defineType(car);
        return car;
    }
}
