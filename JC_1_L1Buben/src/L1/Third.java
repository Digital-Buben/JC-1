package L1;

public class Third {
    public static void main(String[] args) {
        int x=5445;
        int y=54345;
        int z=12345;
        pal(x);
        pal(y);
        pal(z);
    }
    public static void pal(int q) {
        String s =String.valueOf(q);
        char sss[]=s.toCharArray();
        String s1 = "";
        int i;
        for (i=(sss.length-1);i>=0;i--)
            s1+=sss[i];
        System.out.println(s1);
        if (s.equals(s1)==true)
        System.out.println("Число "+q +" является палиндромом");
        else
        System.out.println("Число "+q +" не является палиндромом");


    }
}
