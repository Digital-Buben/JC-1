package L4.util;

import java.util.Random;

public class TransportUtil {

    public static String generateTypeOfUse(){
        int r = new Random().nextInt(5)+1;
        String s ="";
        return s+=r;
    }

}
