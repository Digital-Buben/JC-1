package L1;

public class Second {
    public static void main(String[] args) {
        float array[] = new float[10];
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = (float) (Math.random() * 100 + 1);
            System.out.println("Исходное значение элемента №" + i + "=" + array[i]);
        }
        //Заполнение  массива рандомными значениями и вывод значений на печать
        System.out.println("___________________________________________________________");
        count(array);
        int j;
        for(j=0;j<array.length;j++) {
            System.out.println("Конечное значение элемента №" + j + "=" + array[j]);
        }

    }

    public static float[] count(float array[]){
        int i;
        for(i=0;i<array.length;i++) {
            array[i] = (float) (array[i] +(array[i] * 0.1));
        }
        //Перезаполнение массива

      return array;
    }
}
