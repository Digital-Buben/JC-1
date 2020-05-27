package L2.util;

//Task 1.  Write a Java program to sort a numeric array and a string array.


public class l_two_one {
    //int array
    public static int[] numeric_max_min(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            int preMaxNum=i;
            for (int j = i; j < array.length; j++){
                if(array[j]> array[preMaxNum]){
                    preMaxNum=j;
                }
            }
            int max = array[preMaxNum];
            array[preMaxNum] = array[i];
            array[i]= max;
        }
        return array;
    }
    //string array
    public static String[] stingsArray(String[] sa) {
        for (int i = 0; i < sa.length ; i++) {
            int preMaxNum=i;
            for (int j = i; j < sa.length; j++){
                if(sa[j].compareToIgnoreCase(sa[preMaxNum])>0){
                    preMaxNum=j;
                }
            }
            String max = sa[preMaxNum];
            sa[preMaxNum] = sa[i];
            sa[i]= max;
        }
        return sa;
    }
}

