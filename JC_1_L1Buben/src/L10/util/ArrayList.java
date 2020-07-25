package L10.util;

import L10.domain.Composite;

import java.util.List;

public class ArrayList extends java.util.ArrayList {

    public static String toString(List<Composite> arrayList) {
        String string = "";
        for (int i = 0; i < arrayList.size(); i++) {
            string += arrayList.get(i);
        }
        return string;
    }
}
