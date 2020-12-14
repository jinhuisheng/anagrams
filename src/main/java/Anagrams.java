
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

/**
 * @author huisheng.jin
 * @date 2020/12/15.
 */
public class Anagrams {
    public static List<String> of(String word) {
        if (word.length() == 1) {
            return asList(word);
        }
        List<String> words = new ArrayList<>();
        for (int i = 0; i < word.split("").length; i++) {
            words.addAll(combine(word.charAt(i), delChar(word, i)));
        }
        return words;
    }

    private static String delChar(String word, int i) {
        return new StringBuilder(word).deleteCharAt(i).toString();
    }

    private static List<String> combine(char charAt, String bc) {
        List<String> of = of(bc);
        return of.stream().map(str -> charAt + str).collect(Collectors.toList());
    }

}
