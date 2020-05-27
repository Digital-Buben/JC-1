package L2.util;
//Task 16. Write a Java program to remove duplicate elements from an array.
//я делаю метод по следующиму примеру: {5,1,2,3,5,4,5,3,2,1} на выходе будет {5,1,2,3,4}.
//Т.е. сортировки нет, а происходит простое смещение смещение
public class l_two_16 {

    public static int[] removeDupl(int array[]) {
        int[] operArray = new int[array.length];
        operArray = l_two_8.perversion(array);// до меня долго доходила суть 8 задания, но дошла!!!!
        int upShort = 0;
        for (int i = 0; i < (array.length-1); i++) {
            if (array[i] == operArray[i]) {
                for (int j = (i + 1); j < array.length; j++) {
                    if (array[i] == array[j]) {
                        upShort++;
                        operArray[j] -= 1;
                    }
                }
            }
        }
        int[] shortArray = new int[(array.length-upShort)];
        int j =0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == operArray[i]){
                shortArray[j] = array[i];
                j++;
            }
        }
        return shortArray;
    }
}

