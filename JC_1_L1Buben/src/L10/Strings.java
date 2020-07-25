package L10;

import L10.domain.Text;
import L10.util.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static L10.domain.Text.REGEXP_PARAGRAPHS;

public class Strings {
    public static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.  666,666! 66, 666.6 66.\n";
    public static void main(String[] args) {
        Pattern parags = Pattern.compile(REGEXP_PARAGRAPHS);
        Matcher mParags = parags.matcher(TEXT);
        System.out.println(mParags.find());
        Text text = new Text(Util.textParser(TEXT));
        System.out.println(text);
    }
}
