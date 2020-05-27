package L2.util;

//Task 7.  Write a Java program to remove a specific element from an array.
public class l_two_7 {
    public static int[] removeSpecVal(int[] array, int sv) {
        int n=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == sv){
                n++;
            }
        }
        if (n!=0){
            int[] newArray= new int[(array.length-n)];
            int j=0;
            for (int i = 0; i < array.length  ; i++) {
                if (array[i] != sv){
                    newArray[j] = array[i];
                    j++;
                }
            }
         array = newArray;
         return array;
        } else {return array;}

    }
}
