package L9.domain;

import L3.domain.Car;
import L3.util.CarUtil;

import java.util.HashSet;

public class ExceptionsDemo {
    public static void main(String[] args) {
       HashSet<Car> set = new HashSet();
        for (int i = 0; i < 10; i++) {
            set.add(CarUtil.generateCar());
        }
        System.out.println(set);
        // невозможная ситуация ниже
        System.out.println(searchInCar(1111, set));
        // вероятная ситуация ниже
        System.out.println(searchInCar(1123, set));
    }

   public static Car searchInCar(int transportID, HashSet<Car> set) {
        Car car1= null;
        for (Car car : set) {
            if (car.getRoadTransportID() == transportID) {
                car1 = car;
                break;
            }
        }
        if(car1 == null){
            throw new ResourceNotFoundException("Car was not found " + transportID);
        }
    return car1;}

}
