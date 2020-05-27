package L2.util;

//Task 2.  Write a Java program to sum values of an array.
public class l_two_two{
    public static int SumVal(int[] array){
        int sum=0;
        for(int i=0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

}