package L1;

import java.util.Scanner;

public class Sixteenth {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите минимальное значение");
        int min= in.nextInt();
        System.out.println("Введите максимальное значение");
        int max = in.nextInt();
        System.out.println("Введите значение шага");
        int step= in.nextInt();
        int i;
        for (i=min; i<=max; i+=step)
            System.out.println(i);

    }
}
