import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Anagrams {
    public static List<String> of(String word) {
        if (word.length() == 1) {
            return Collections.singletonList(word);
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            List<String> anagramsOfTheLeft = of(delChar(word, i));
            for (String s : anagramsOfTheLeft) {
                list.add(word.charAt(i) + s);
            }
        }
        return list;
    }

    private static String delChar(String word, int index) {
        return new StringBuilder(word).deleteCharAt(index).toString();
    }
}
