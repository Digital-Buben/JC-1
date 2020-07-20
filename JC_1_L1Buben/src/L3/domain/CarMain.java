package L3.domain;

import L3.util.CarUtil;



public class CarMain {
    public static void main(String[] args) {
        Car car = CarUtil.generateCar();
        System.out.println(car);
        car.sportification();
        System.out.println(car);

    }
}
