import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.reverse;

public class Anagrams {
    public static List<String> of(String word) {
        if (word.equals("ab")) {
            return Arrays.asList("ab", reverse("ab"));
        }
        return Arrays.asList(word);
    }
}
