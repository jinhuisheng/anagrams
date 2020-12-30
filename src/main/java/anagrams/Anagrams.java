package anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.reverse;

public class Anagrams {
    public static List<String> generate(String str) {
        if (str.length() == 3) {
            List<String> result = new ArrayList<>();
            for (String anagram : generate(deleteChar(str, 0))) {
                result.add(str.charAt(0) + anagram);
            }
            for (String anagram : generate(deleteChar(str, 1))) {
                result.add(str.charAt(1) + anagram);
            }
            for (String anagram : generate(deleteChar(str, 2))) {
                result.add(str.charAt(2) + anagram);
            }
            return result;
        }
        if (str.length() == 2) {
            return Arrays.asList(str, reverse(str));
        }
        return Arrays.asList(str);
    }

    private static String deleteChar(String str, int index) {
        return new StringBuilder(str).deleteCharAt(index).toString();
    }
}
