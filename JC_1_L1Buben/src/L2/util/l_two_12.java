package L2.util;
//Task 12. Write a Java program to find the duplicate values of an array of integer values.

// Есть вариант применения похжего метода с предварительной max--> min сортировкой, но я полагаю, что подключение того
// вместе с похожим методам даст только ухудшение производительности
public class l_two_12 {
    public static void intDublicate (int array[]) {
        String s ="";
        int n = 0;
        for (int i = 0; i < (array.length-1); i++) {
            for (int j = (i+1); j <array.length; j++) {
                int x = 0;//для того, чтобы не выводить дважды значение при 3 и более одинаковых элементов
                if (array[i] == array[j]) {
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
