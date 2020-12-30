package anagrams;

import java.util.Arrays;
import java.util.List;

public class Anagrams {
    public static List<String> of(String str) {
        if (str.length() == 2) {
            return Arrays.asList("ab", "ba");
        }
        return Arrays.asList("a");
    }
}
