package L7;

import L3.domain.Car;
import L3.util.CarUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class L7practice {
    public static void main(String[] args) {
        int numberOfString = 100;
        ArrayList<String> arrayList = new ArrayList<>(numberOfString);

        for (int i = 0; i < numberOfString; i++) {
            arrayList.add(i, ("ArrayLIST String" + i));
        }

        System.out.println(arrayList);

        LinkedList<String>  linkedList = new LinkedList<>();
        for (int i = 0; i < numberOfString; i++) {
            linkedList.add(i, ("LinkedLIST String" + i));
        }
        System.out.println(linkedList);


        System.out.println("Bench");
        System.out.println("_______________________________________________________________");
        Car carForBench = CarUtil.generateCar();
        LinkedList<Car> carLinkedList = new LinkedList<Car>(Arrays.asList(CarUtil.generateCars(10000000)));
        long linkedLastAdd = BenchLinkedList.linkedLastAdd(carLinkedList,carForBench);
        long likedMidAdd = BenchLinkedList.linkedMidAdd(carLinkedList, carForBench);

        ArrayList<Car> carArrayList = new ArrayList<Car>(carLinkedList);
        carLinkedList = null;

        long arrayLastAdd = BenchArrayList.arrayLastAdd(carArrayList, carForBench);
        long arrayMidAdd = BenchArrayList.arrayMidAdd(carArrayList, carForBench);

        if(likedMidAdd > arrayMidAdd){
            System.out.println("Добавление в середину происходит медленнее у линкед листа");
        }else if (likedMidAdd < arrayMidAdd){
            System.out.println("Добавление в середину происходит медленнее у аррэй листа");
        } else {
            System.out.println("Равны");
        }

        if(linkedLastAdd > arrayLastAdd){
            System.out.println("Добавление в конец происходит медленнее у линкед листа");
        }else if (linkedLastAdd < arrayLastAdd){
            System.out.println("Добавление в конец происходит медленнее у аррэй листа");
        } else {
            System.out.println("Равны");
        }


    }
}
