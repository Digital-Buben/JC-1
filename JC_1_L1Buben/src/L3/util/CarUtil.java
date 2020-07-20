package L3.util;

import L3.domain.Car;
import L5.enums.CarType;

import java.util.Random;

public class CarUtil {
    //CarID should be defined ONLY by computer
    static long carID = 0L;

    public static void generateCarID(Car car) {
        car.setCarID(carID);
        carID++;
    }

    public static int generateWeight() {
        return new Random().nextInt(4000) + 300;
    }

    //Car type should be defined ONLY by computer

    public static void defineType(Car car) {
        //SWICTH is not Suitable (need to create either a few booleans or create additional IF ELSE and
        //then SWITCH or generate weight 1 up to 3)
        if (car.getWeight() < 1501) {
            car.setCarType(CarType.PASSENGER_CAR);
        } else {
            if (car.getWeight() > 1500 && car.getWeight() < 3501) {
                car.setCarType(CarType.OFFROADER);
            } else {
                car.setCarType(CarType.TRUCK);
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

    public static Car[] generateCars(int quantity){
        Car[] cars = new Car[quantity];
        for (int i = 0; i< quantity; i++){
            generateCar();
        }
        return cars;
    }
}
