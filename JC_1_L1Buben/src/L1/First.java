package L1;

public class First {
    public static void main(String[] args){
        int m = 72;
        //масса
        float g = 9.8f;
        //ускорение свободного падения
        float P = m*g;
        //сила тяжести и, при отсутствии посторонних ускорений, вес на Земле
        System.out.println("Мой вес на Луне " + P*0.16f +" H" );
    }
}
