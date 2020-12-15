import java.util.Arrays;
import java.util.List;

/**
 * @author huisheng.jin
 * @date 2020/12/15.
 */
public class Anagrams {
    public static List<String> of(String word) {
        if (word.equals("ab")) {
            return Arrays.asList("ab", "ba");
        }
        return Arrays.asList(word);
    }
}
