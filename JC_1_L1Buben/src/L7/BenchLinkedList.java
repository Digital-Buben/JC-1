package L7;

import L3.domain.Car;

import java.util.LinkedList;

public class BenchLinkedList {
    public static long linkedLastAdd(LinkedList<Car> carLinkedList, Car car) {

        long start = System.currentTimeMillis();
        carLinkedList.add(car);
        long finish = System.currentTimeMillis();
        long lastAddlinkedTime = finish - start;
        return lastAddlinkedTime;
    }

    public static long linkedMidAdd(LinkedList<Car> carLinkedList, Car car) {
        long start = System.currentTimeMillis();
        carLinkedList.add((carLinkedList.size()/2), car);
        long finish = System.currentTimeMillis();
        long lastAddlinkedTime = finish - start;
        return lastAddlinkedTime;
    }
}
