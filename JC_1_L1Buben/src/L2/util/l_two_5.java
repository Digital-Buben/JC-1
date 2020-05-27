package L2.util;
//Task 5.  Write a Java program to test if an array contains a specific value.
public class l_two_5 {
    public static void FSpecVal(int[] array, int sv) {
        int n=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == sv){
                n++;
            }
        }
        if (n>0){
            System.out.println("В данном массиве имеется такое значение");
        } else{
            System.out.println("В данном массиве не найдено заданное значение");
        }


    }
}
