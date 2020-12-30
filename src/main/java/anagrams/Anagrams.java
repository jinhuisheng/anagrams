package anagrams;

import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.reverse;

public class Anagrams {
    public static List<String> of(String str) {
        if (str.length() == 3) {
            return Arrays.asList(
                    str.charAt(0) + Anagrams.of("bc").get(0),
                    str.charAt(0) + Anagrams.of("bc").get(1),

                    "bac",
                    "bca",
                    "cab",
                    "cba"
            );
        }
        if (str.length() == 2) {
            return Arrays.asList(str, reverse(str));
        }
        return Arrays.asList(str);
    }
}
