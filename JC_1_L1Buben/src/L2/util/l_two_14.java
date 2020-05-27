package L2.util;
//Task 14. Write a Java program to find the common elements between two arrays (string values).
public class l_two_14 {
    public static void stringCommon (String array[], String array1[]) {
        String[] ar; //min.length array
        String[] ar1;//max.length array
        if (array.length< array1.length){ar = array; ar1 = array1;}
        else {ar = array1; ar1 = array;}
        // убираю дублирующие элементы в наименьшем массиве
        String[] operArray = new String[ar.length];
        for (int i = 0; i < ar.length; i++) {
            operArray[i] = ar[i];
        }
        int upShort = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].equals(operArray[i])) {
                for (int j = (i + 1); j < ar.length; j++) {
                    if (ar[i].equals(operArray[j])) {
                        upShort++;
                        operArray[j] += 1;
                    }
                }
            }
        }
        String[] shortArray = new String[(ar.length-upShort)];
        int j =0;
        for (int i = 0; i < ar.length ; i++) {
            if (ar[i].equals(operArray[i])){
                shortArray[j] = ar[i];
                j++;
            }
        }
        //убрал дублирующие элементы
        //формально, большая часть программы - это адаптация 16 задания под String[]
        //а та часть, которая ниже - адаптация 8
        String s ="";
        int n = 0;
        for (int i = 0; i < shortArray.length; i++) {
            for (int k = 0; k <ar1.length; k++) {
                int x = 0;//для того, чтобы не выводить дважды значение при 3 и более одинаковых элементов
                if ((shortArray[i]).equals(ar1[k])) {
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
