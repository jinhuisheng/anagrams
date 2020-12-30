package anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.reverse;

public class Anagrams {
    public static List<String> of(String str) {
        if (str.length() == 3) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                List<String> anagramsOfTheLeft = Anagrams.of(deleteCharAt(str, i));
                for (String s : anagramsOfTheLeft) {
                    result.add(str.charAt(i) + s);
                }
            }
            return result;
        }
        if (str.length() == 2) {
            return Arrays.asList(str, reverse(str));
        }
        return Arrays.asList(str);
    }

    private static String deleteCharAt(String str, int index) {
        return new StringBuilder(str).deleteCharAt(index).toString();
    }
}
