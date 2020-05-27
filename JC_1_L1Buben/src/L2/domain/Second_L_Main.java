package L2.domain;

import L2.util.*;

import java.util.ArrayList;

//L2 main part 2
// task 12+
public class Second_L_Main {
    public static void main(String[] args) {
        System.out.println("Numeric array");
        System.out.println("Исходный массив");
        int[] array=new int[(int) (Math.random()*20+1)];
        for (int i=0; i<array.length;i++){
            array[i]= (int) (Math.random()*50+1);
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");








        System.out.println("");
        System.out.println("_______________________________________________________");
        System.out.println("String array");
        String zero = "abcdefghijklmnopqrstuvwxyz";
        String[] sa=new String[(int) (Math.random()*20+1)]; //количество строк
        for (int i=0; i<sa.length;i++){
            int NoL=(int) (Math.random()*20+1); // количество символов в строке
            sa[i] = "";
            for (int j=0; j<=NoL; j++) {
                sa[i] += zero.charAt((int) (Math.random() * 26));
            }
            System.out.print(sa[i] + "   ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");





        System.out.println("Task 12");
        for (int i=0; i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");
        l_two_12.intDublicate(array);


        System.out.println("");
        System.out.println("_______________________________________________________");
        System.out.println("Task 13");
        for (int i = 0; i <sa.length ; i++) {
            System.out.print(sa[i] + "   ");

        }
        System.out.println("");
        System.out.println("_______________________________________________________");
        l_two_13.stringDublicate(sa);







        System.out.println("Task 14");
        String[] sa2=new String[(int) (Math.random()*20+1)]; //количество строк
        for (int i=0; i<sa2.length;i++){
            int NoL=(int) (Math.random()*20+1); // количество символов в строке
            sa2[i] = "";
            for (int j=0; j<=NoL; j++) {
                sa2[i] += zero.charAt((int) (Math.random() * 26));
            }
            System.out.print(sa2[i] + "   ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");

        String[] sa1 =new String[(int) (Math.random()*20+1)]; //количество строк
        for (int i = 0; i< sa1.length; i++){
            int NoL=(int) (Math.random()*20+1); // количество символов в строке
            sa1[i] = "";
            for (int j=0; j<=NoL; j++) {
                sa1[i] += zero.charAt((int) (Math.random() * 26));
            }
            System.out.print(sa1[i] + "   ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");
        l_two_14.stringCommon(sa2, sa1);





        System.out.println("_______________________________________________________");
        System.out.println("Task 15");
        System.out.println("Исходный массив");
        int[] array1=new int[(int) (Math.random()*20+1)];
        for (int i=0; i<array1.length;i++){
            array1[i]= (int) (Math.random()*50+1);
            System.out.print(array1[i]+" ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");
        int[] array2=new int[(int) (Math.random()*20+1)];
        for (int i=0; i<array2.length;i++){
            array2[i]= (int) (Math.random()*50+1);
            System.out.print(array2[i]+" ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");
        l_two_15.intCommon(array2, array1);







        System.out.println("_______________________________________________________");
        System.out.println("Task 16");
        System.out.println("Исходный массив");
        for (int i=0; i<array.length;i++){
            array[i]= (int) (Math.random()*50+1);
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");
        array = l_two_16.removeDupl(array);
        for (int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");






        System.out.println("Task 17");
        System.out.println("Исходный массив");
        for (int i=0; i<array.length;i++){
            array[i]= (int) (Math.random()*50+1);
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");
        int secondLargest = l_two_17.secondLargest(array);
        System.out.println(secondLargest);







        System.out.println("Task 18");
        System.out.println("Исходный массив");
        for (int i=0; i<array.length;i++){
            array[i]= (int) (Math.random()*50+1);
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");
        int secondSmallest = l_two_18.secondSmallest(array);
        System.out.println(secondSmallest);




        System.out.println("_______________________________________________________");
        System.out.println("Task 19");
        int[][] TroisARRAY1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] TroisARRAY2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] TroisARRAYfinal = l_two_19.sumMatrices(TroisARRAY1, TroisARRAY2);
        for (int i = 0; i < TroisARRAYfinal.length ; i++) {
            for (int j = 0; j < TroisARRAYfinal[i].length ; j++) {
                System.out.print(TroisARRAYfinal[i][j] + "  ");
            }
            System.out.println(" ");
        }


        System.out.println(" ");
        System.out.println("_______________________________________________________");
        System.out.println("Task 20");
        ArrayList AL = l_two_20.toList(array);
            System.out.println(AL);












    }
}
