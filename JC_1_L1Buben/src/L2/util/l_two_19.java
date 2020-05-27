package L2.util;
//Task 19. Write a Java program to add two matrices of the same size.
public class l_two_19 {
    public static int[][] sumMatrices(int[][] array, int[][] array1) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                array[i][j] = array[i][j]+ array1[i][j];
            }
        }
        return array;
    }
}
