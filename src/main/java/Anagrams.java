import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.reverse;

public class Anagrams {
    public static List<String> of(String word) {
        if (word.length() >= 2) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < word.length(); i++) {
                List<String> anagramsOfTheLeft = of(delChar(word, i));
                for (String s : anagramsOfTheLeft) {
                    list.add(word.charAt(i) + s);
                }
            }
            return list;
        }
        return Arrays.asList(word);
    }

    private static String delChar(String word, int index) {
        return new StringBuilder(word).deleteCharAt(index).toString();
    }
}
