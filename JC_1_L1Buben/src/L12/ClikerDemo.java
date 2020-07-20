package L12;

import java.io.IOException;

public class ClikerDemo {
    public static void main(String[] args) throws InterruptedException, IOException {

        Clicker clicker = new Clicker();
        clicker.start();
        clicker.sleep(30);

        clicker.changeStopFlag();
        clicker.join();
    }
}

