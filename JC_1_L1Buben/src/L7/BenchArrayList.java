package L7;

import L3.domain.Car;

import java.util.ArrayList;

public class BenchArrayList {
    public static long arrayLastAdd(ArrayList<Car> carArrayList, Car car) {

        long start = System.currentTimeMillis();
        carArrayList.add(car);
        long finish = System.currentTimeMillis();
        long lastAddArrayTime = finish - start;
        return lastAddArrayTime;
    }

    public static long arrayMidAdd(ArrayList<Car> carArrayList, Car car) {
        long start = System.currentTimeMillis();
        carArrayList.add((carArrayList.size()/2), car);
        long finish = System.currentTimeMillis();
        long lastAddArrayTime = finish - start;
        return lastAddArrayTime;
    }
}
