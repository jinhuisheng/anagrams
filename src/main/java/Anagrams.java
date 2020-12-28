import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.reverse;

public class Anagrams {
    public static List<String> of(String word) {
        if (word.length() == 2) {
            return Arrays.asList(word, reverse(word));
        }
        if (word.length() == 1) {
            return Arrays.asList(word);
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            for (String str : of(delChar(word, i))) {
                list.add(word.charAt(i) + str);
            }
        }
        return list;
    }

    private static String delChar(String word, int index) {
        return new StringBuilder(word).deleteCharAt(index).toString();
    }
}
