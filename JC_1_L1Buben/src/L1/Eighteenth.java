package L1;

public class Eighteenth {
    public static void main(String[] args) {
        float byn=101.0f;
        float cursed=0.4087f;
        float usd=conv(byn,cursed);
        System.out.println(byn+ " Бел.рублей = "+ usd +" долларов США");
    }

    public static float conv(float Bmoney, float rate) {
        float dol=Bmoney*rate;
        return dol;
    }
}
