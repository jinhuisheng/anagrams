package anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.reverse;

public class Anagrams {
    public static List<String> generate(String str) {
        if (str.length() == 3) {
            List<String> result = new ArrayList<>();
            List<String> anagramsOfMinusOneChar = generate(deleteChar(str, 0));
            for (String anagram : anagramsOfMinusOneChar) {
                result.add(str.charAt(0) + anagram);
            }

            result.add(str.charAt(1) + generate(deleteChar(str, 1)).get(0));
            result.add(str.charAt(1) + generate(deleteChar(str, 1)).get(1));
            result.add(str.charAt(2) + generate(deleteChar(str, 2)).get(0));
            result.add(str.charAt(2) + generate(deleteChar(str, 2)).get(1));
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
