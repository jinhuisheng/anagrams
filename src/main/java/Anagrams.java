import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.reverse;

public class Anagrams {
    public static List<String> of(String word) {
        if (word.length() == 3) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                list.add(word.charAt(i) + of(delChar(word, i)).get(0));
                list.add(word.charAt(i) + of(delChar(word, i)).get(1));
            }
            return list;
//
//            return Arrays.asList(
//                    word.charAt(0) + of(delChar(word, 0)).get(0),
//                    word.charAt(0) + of(delChar(word, 0)).get(1),
//                    "bac",
//                    "bca",
//                    "cab",
//                    "cba"
//            );
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
