package L2.util;
//Task 9.  Write a Java program to insert an element (specific position) into an array.
public class l_two_9 {
    public static int[] Inserting(int[] array, int position, int value) {
        int[] newArray = new int[array.length+1];
        if (position>= newArray.length){
            System.out.println("Невозможно вставить элемент в данную позицию");
        }
        for (int i = 0; i < position ; i++) {
            newArray[i] = array[i];
        }
        newArray[position]= value;
        for (int i = (position + 1); i < newArray.length ; i++) {
            newArray[i] = array[(i-1)];
        }
        array = newArray;
        return array;


    }
}
