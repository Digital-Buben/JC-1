package L2.util;
//Task 8.  Write a Java program to copy an array by iterating the array.
public class l_two_8 {
    public static int[] perversion (int [] array) {
        int [] array1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        return array1;
    }
}
