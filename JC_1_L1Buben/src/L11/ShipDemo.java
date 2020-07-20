package L11;

import L11.util.ShipUtil;

import java.util.concurrent.Semaphore;

public class ShipDemo {
    public static final int OPERATORS_QUANTITY = 5;

    public static final boolean[] OPERATORS = new boolean[OPERATORS_QUANTITY];

    public static final Semaphore OPERATOR_SEMAPHORE = new Semaphore(OPERATORS_QUANTITY, true);

    public static volatile int shipQueue = 0;


    public static void main(String[] args) throws InterruptedException {
        int shipQuantity = 150;
        //Приветствую, тут я опишу общую логику.
        //генерируется 150 кораблей
        //одновременно с этим операторы начинают распределять их по портам
        //есть три вида портов со своими ограничениями по количеству мест
        //нумерация доков в портах разного типа НЕ является сквозной
        //
        //
        //оператор заканчивает работу после швартовки, но не сразу -
        //решает организационные вопросы
        //В идеале, нужно было бы увеличить время .sleep() для всех таких операций. Это действие повысило
        // бы "читабельность", но замедлило бы и без того медленный процесс

        for (int i = 1; i <= shipQuantity; i++) {
            new Thread(ShipUtil.generateShip(i)).start();
            System.out.println("В акваторию порта вошел новый корабль № " + i);
            shipQueue++;
            System.out.println("Кораблей ожидающих связи с оператором порта :" + shipQueue);
            Thread.sleep(300);
        }
    }


}

