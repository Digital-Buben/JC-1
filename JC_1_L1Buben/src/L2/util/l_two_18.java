package L2.util;
//Task 18. Write a Java program to find the second smallest element in an array.
public class l_two_18 {
    //пишу метод под сортировку и удаление дубликатов, позицию самого элемента и дуликатов можно получить
    // при помощи 6 задания
    public static int secondSmallest(int[] array) {
        l_two_one.numeric_max_min(array);
        array = l_two_16.removeDupl(array);
        return array[array.length-2];
    }
}
