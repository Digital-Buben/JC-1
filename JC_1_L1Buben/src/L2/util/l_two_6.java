package L2.util;

//Task 6.  Write a Java program to find the index of an array element.


public class l_two_6 {
    public static void IndexSpecVal(int[] array, int sv) {
        String s = "";
        int n=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == sv){
                s+= i+", ";
                n++;
            }
        }
        switch (n){
            case 0: {
                System.out.println("В данном массиве необходимое значение не найдено");
                break;
            }
            case 1: {
                s = s.substring(0, (s.length()-2));
                System.out.println("Необходимое значение найдено в " + s + " позиции");
                break;
            }
            default : {
                s = s.substring(0, (s.length()-2));
                System.out.println("Необходимое значение найдено в " + s + " позициях");
                break;
            }
        }
    }
}
