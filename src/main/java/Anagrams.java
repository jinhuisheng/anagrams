import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author huisheng.jin
 * @date 2020/12/15.
 */
public class Anagrams {
    public static List<String> of(String word) {
        if (word.length() == 1) {
            return Arrays.asList(word);
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            char indexChar = word.charAt(i);
            of(deleteChar(word, i)).forEach(str -> result.add(indexChar + str));
        }
        return result;
    }

    private static String deleteChar(String word, Integer index) {
        return new StringBuilder(word).deleteCharAt(index).toString();
    }

    private static String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
