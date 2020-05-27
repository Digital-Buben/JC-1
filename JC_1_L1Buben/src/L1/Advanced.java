package L1;

import java.util.Scanner;

public class Advanced {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите количество суток");
        int days= in.nextInt();
        int hours= days*24;
        System.out.println("Количество часов = "+hours);
        int min= hours*60;
        System.out.println("Количество минут = "+min);
        int sec= min*60;
        System.out.println("Количество секунд = "+sec);

    }
}
