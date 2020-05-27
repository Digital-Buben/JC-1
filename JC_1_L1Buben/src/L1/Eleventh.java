package L1;

public class Eleventh {
    public static void main(String[] args) {
        int a=33;
        int b=27;
        int c=93;
        System.out.println("Максимальное значение ="+Math.max((Math.max(a,b)),c));
        // Либо
        if (a>b && a>c)
            System.out.println("Максимальное значение, равное "+ a+ "имеет переменная а");
        else if(b>c)
            System.out.println("Максимальное значение, равное "+ b+ "имеет переменная b");
        else
            System.out.println("Максимальное значение, равное "+ c+ "имеет переменная c");


    }
}
