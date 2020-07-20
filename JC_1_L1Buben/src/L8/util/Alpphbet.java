package L8.util;

import static java.lang.Character.isLetter;
import static java.lang.Character.toUpperCase;

public class Alpphbet {
    public static boolean vowel (char letter){
        String vowelLetters = "АЕЁИОУЫЭЮЯ";
        boolean bool = false;
        if (isLetter(letter)){
            toUpperCase(letter);
            for (int i = 0; i < vowelLetters.length() ; i++) {
                if (vowelLetters.charAt(i) == letter){
                    bool = true;
                    break;
                }
            }
        }
        return bool;
    }
}
