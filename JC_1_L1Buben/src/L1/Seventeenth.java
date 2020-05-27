package L1;

public class Seventeenth {
    public static void main(String[] args) {
        float array[] = new float[10];
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = (float) (Math.random() * 100 + 1);
            System.out.println("Исходное значение элемента №" + i + "=" + array[i]);
        }
        System.out.println("________________________________________________________");
        //массив и заполнение
        int j;
        float max=0.0f;
        for(j=0; j < array.length; j++){
            if (max < array[j])
                max = array[j];
        }
        int f;
        for(f=0;f<array.length;f++){
            array[f]/=max;
            System.out.println("Конечное значение элемента №" + f + "=" + array[f]);
        }
    }
}
