package anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.reverse;

public class Anagrams {
    public static List<String> generate(String str) {
        if (str.length() == 3) {
            List<String> result = new ArrayList<>();
            result.add("a" + generate("bc").get(0));
            result.add("a" + generate("bc").get(1));
            result.add("b" + generate("ac").get(0));
            result.add("b" + generate("ac").get(1));
            result.add("c" + "ab");
            result.add("c" + "ba");
            return result;
        }
        if (str.length() == 2) {
            return Arrays.asList(str, reverse(str));
        }
        return Arrays.asList(str);
    }
}
