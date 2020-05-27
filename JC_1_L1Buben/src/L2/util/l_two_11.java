package L2.util;
//  Task 11. Write a Java program to reverse an array of integer values.
public class l_two_11 {
    public static int[] arrayReversion(int[] array) {
        for (int i = 0; i < (array.length/2) ; i++) {
            int x = array[i];
            array[i] = array[(array.length-1-i)];
            array[(array.length-1-i)] = x;
        }
        return array;
        
    }
}
