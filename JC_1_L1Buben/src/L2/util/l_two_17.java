package L2.util;
//Task 17. Write a Java program to find the second largest element in an array.
public class l_two_17 {
    //пишу метод под сортировку и удаление дубликатов, позицию самого элемента и дуликатов можно получить
    // при помощи 6 задания
    public static int secondLargest(int[] array) {
        l_two_one.numeric_max_min(array);
        array = l_two_16.removeDupl(array);
        return array[1];
    }
}
