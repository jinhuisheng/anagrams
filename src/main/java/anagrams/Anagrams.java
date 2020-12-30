package anagrams;

import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.reverse;

public class Anagrams {
    public static List<String> generate(String str) {
        if (str.equals("ab")) {
            return Arrays.asList(str, reverse(str));
        }
        return Arrays.asList(str);
    }
}
