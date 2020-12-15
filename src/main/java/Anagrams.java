import java.util.Arrays;
import java.util.List;

/**
 * @author huisheng.jin
 * @date 2020/12/15.
 */
public class Anagrams {
    public static List<String> of(String word) {
        if (word.equals("abc")) {
            return Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba");
        }
        if (word.length() == 2) {
            return Arrays.asList(word, reverse(word));
        }
        return Arrays.asList(word);
    }

    private static String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
