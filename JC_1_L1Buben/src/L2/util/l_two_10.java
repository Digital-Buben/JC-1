package L2.util;
//Task 10. Write a Java program to find the maximum and minimum value of an array.
public class l_two_10 {
    public static void fMaxMin(int[] array) {
        l_two_one.numeric_max_min(array);
        int max = array[0];
        int min = array[array.length-1];
        System.out.println("Значение наибольшего элемента = "+max);
        System.out.println("Значение наименьшего элемента = "+ min);
    }
}
