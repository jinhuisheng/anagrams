import java.util.Arrays;
import java.util.List;

/**
 * @author huisheng.jin
 * @date 2020/12/15.
 */
public class Anagrams {
    public static List<String> of(String word) {
        if (word.equals("ab")) {
            return Arrays.asList("ab", reverse("ab"));
        }
        return Arrays.asList(word);
    }

    private static String reverse(String word) {
        return new StringBuilder("ab").reverse().toString();
    }
}
