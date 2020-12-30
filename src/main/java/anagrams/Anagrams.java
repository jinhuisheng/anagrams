package anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.reverse;

public class Anagrams {
    public static List<String> generate(String str) {
        if (str.length() >= 2) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                for (String anagram : generate(deleteChar(str, i))) {
                    result.add(str.charAt(i) + anagram);
                }
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
