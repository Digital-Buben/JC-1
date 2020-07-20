package L10.util;

public class ArrayList extends java.util.ArrayList {
    public static String toString(java.util.ArrayList<?> arrayList) {
        String string = "";
        for (int i = 0; i < arrayList.size(); i++) {
            string += arrayList.get(i);
        }
        return string;
    }
}
