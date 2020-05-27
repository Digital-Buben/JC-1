package L2.util;
//Task 13. Write a Java program to find the duplicate values of an array of string values.
public class l_two_13 {
    public static void stringDublicate (String array[]) {
        String s ="";
        int n = 0;
        for (int i = 0; i < (array.length-1); i++) {
            for (int j = (i+1); j <array.length; j++) {
                int x = 0;//для того, чтобы не выводить дважды значение при 3 и более одинаковых элементов
                if (array[i].equals(array[j])) {
                    if (n == 0) {
                        s += array[i];
                    } else if (n != 0 && x < 2){
                        s += ", " + array[i];
                    } else i++;
                    n++;
                    x++;
                }
            }
        }
        if (n == 0){
            System.out.println("Дублирующие элементы в данном массиве не найдены");
        } else if (n >1){
            System.out.println("В данном массиве найдены дубликаты следующих элементов: " + s);
        }
        else {
            System.out.println("В данном массиве дублируется только число " + s);
        }
    }
}
