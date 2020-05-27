package L2.util;
//Task 15. Write a Java program to find the common elements between two arrays of integers.
public class l_two_15 {
    public static void intCommon (int array[], int array1[]) {
        int[] ar; //min.length array
        int[] ar1;//max.length array
        if (array.length< array1.length){ar = array; ar1 = array1;}
        else {ar = array1; ar1 = array;}
        // убираю дублирующие элементы в наименьшем массиве
        int[] operArray = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            operArray[i] = ar[i];
        }
        int upShort = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == (operArray[i])) {
                for (int j = (i + 1); j < ar.length; j++) {
                    if (ar[i] == (operArray[j])) {
                        upShort++;
                        operArray[j] += 1;
                    }
                }
            }
        }
        int[] shortArray = new int[(ar.length-upShort)];
        int j =0;
        for (int i = 0; i < ar.length ; i++) {
            if (ar[i] == (operArray[i])){
                shortArray[j] = ar[i];
                j++;
            }
        }
        //убрал дублирующие элементы

        String s ="";
        int n = 0;
        for (int i = 0; i < shortArray.length; i++) {
            for (int k = 0; k <ar1.length; k++) {
                int x = 0;//для того, чтобы не выводить дважды значение при 3 и более одинаковых элементов
                if ((shortArray[i]) == (ar1[k])) {
                    if (n == 0) {
                        s += shortArray[i];
                    } else if (n != 0 && x < 2){
                        s += ", " + shortArray[i];
                    } else i++;
                    n++;
                    x++;
                }
            }
        }
        if (n == 0){
            System.out.println("Общих элементов между массивами не найдено");
        } else if (n >1){
            System.out.println("Общими элементами между данными массивами являются: " + s);
        }
        else {
            System.out.println("Общим элементом является только " + s);
        }
    }
}
