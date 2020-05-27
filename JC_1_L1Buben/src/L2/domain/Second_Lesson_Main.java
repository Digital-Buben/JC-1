package L2.domain;

import L2.util.*;

import java.util.Scanner;

public class Second_Lesson_Main {
    public static void main(String[] args) {
        // все условия указаны перед классам
        System.out.println("Task 1");
        System.out.println("Numeric array");
        System.out.println("Исходный массив");
        int[] array=new int[(int) (Math.random()*20+1)];
        for (int i=0; i<array.length;i++){
            array[i]= (int) (Math.random()*50+1);
            System.out.print(array[i]+" ");
        }
        //Ахтунг!!! Костыль!!! принтЛН(с черточками) после пробела выводит черточки в строке с массивом
        System.out.println("");
        System.out.println("_______________________________________________________");
        System.out.println("После max->min сортировки массив");
        l_two_one.numeric_max_min(array);
        for (int i=0; i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
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
        System.out.println("Строковый массив после сортировки");
        l_two_one.stingsArray(sa);
        for (int i=0; i<sa.length;i++) {
            System.out.print(sa[i] + " ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");






        System.out.println("Task 2");
        for (int i=0; i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");
        int sum = l_two_two.SumVal(array);
        System.out.println(sum);
        System.out.println("_______________________________________________________");






        System.out.println("Task 4");
        for (int i=0; i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");
        int average=0;
        average = l_two_4.average(array);
        System.out.println("Среднее значение = " + average);




        System.out.println("_______________________________________________________");
        System.out.println("Task 5");
        for (int i=0; i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение");
        int SearchValue= in.nextInt();
        l_two_5.FSpecVal(array, SearchValue);





        System.out.println("_______________________________________________________");
        System.out.println("Task 6");
        for (int i=0; i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");
        in = new Scanner(System.in);
        System.out.println("Введите значение");
        SearchValue= in.nextInt();
        l_two_6.IndexSpecVal(array, SearchValue);





        System.out.println("_______________________________________________________");
        System.out.println("Task 7");
        for (int i=0; i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");
        in = new Scanner(System.in);
        System.out.println("Введите значение");
        SearchValue= in.nextInt();
        array = l_two_7.removeSpecVal(array, SearchValue);
        System.out.println("После удаления");
        for (int i=0; i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");



        System.out.println("_______________________________________________________");
        System.out.println("Task 8");
        for (int i=0; i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");
        int[] array1 =l_two_8.perversion(array);
        for (int i=0; i<array1.length;i++) {
            System.out.print(array1[i] + " ");
        }





        System.out.println("");
        System.out.println("_______________________________________________________");
        System.out.println("Task 9");
        for (int i=0; i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");
        in = new Scanner(System.in);
        System.out.println("Введите позицию вставки");
        int insertPosition= in.nextInt();
        in = new Scanner(System.in);
        System.out.println("Введите значение элемента");
        int insertValue= in.nextInt();
        array = l_two_9.Inserting(array, insertPosition, insertValue);
        System.out.println("После вставки");
        for (int i=0; i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");






        System.out.println("Task 10");
        l_two_10.fMaxMin(array);
        System.out.println("_______________________________________________________");






        System.out.println("Task 11");
        for (int i=0; i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");
        System.out.println("Массив после реверса");
        l_two_11.arrayReversion(array);
        for (int i=0; i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("_______________________________________________________");




    }
}
