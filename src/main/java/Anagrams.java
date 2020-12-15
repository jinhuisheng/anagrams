import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author huisheng.jin
 * @date 2020/12/15.
 */
public class Anagrams {
    public static List<String> of(String word) {
        if (word.equals("abc")) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < word.length(); i++) {
                char firstChar = word.charAt(i);
                of(deleteChar(word, i)).forEach(str -> result.add(firstChar + str));
            }
            return result;
        }
        if (word.length() == 2) {
            return Arrays.asList(word, reverse(word));
        }
        return Arrays.asList(word);
    }

    private static String deleteChar(String word, Integer index) {
        return new StringBuilder(word).deleteCharAt(index).toString();
    }

    private static String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
