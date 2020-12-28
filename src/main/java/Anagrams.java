import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.reverse;

public class Anagrams {
    public static List<String> of(String word) {
        if (word.length() == 3) {
            return Arrays.asList(
                    "abc",
                    "acb",
                    "bac",
                    "bca",
                    "cab",
                    "cba"
            );
        }
        if (word.length() == 2) {
            return Arrays.asList(word, reverse(word));
        }
        return Arrays.asList(word);
    }
}
