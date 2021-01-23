package dev.justinf.conjugation.type;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Conjugation {

    String neutral(String root);
    String past(String root);
    String present(String root);
    String future(String root);

    String explanation(String root);

    default int rootIndex(String s) {
        if (s.length() <= 1) { // We look for at least two characters in the string
            return -1;
        }

        Matcher m = Pattern.compile("[aeiouAEIOU]").matcher(s);
        if (m.find()) {
            switch (m.start()) {
                case 0:
                case 1:
                    return m.start();
                default:
                    return -1;
            }
        } else {
            return -1;
        }
    }
}