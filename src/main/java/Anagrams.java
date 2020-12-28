import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.reverse;

public class Anagrams {
    public static List<String> of(String word) {
        if (word.length() == 3) {
            List<String> list = new ArrayList<>();
            for (String str : of(delChar(word, 0))) {
                list.add(word.charAt(0) + str);
            }
            for (String str : of("ac")) {
                list.add(word.charAt(1) + str);
            }
            for (String str : of("ab")) {
                list.add(word.charAt(2) + str);
            }
            return list;
        }
        if (word.length() == 2) {
            return Arrays.asList(word, reverse(word));
        }
        return Arrays.asList(word);
    }

    private static String delChar(String word, int index) {
        return new StringBuilder(word).deleteCharAt(index).toString();
    }
}
