package anagrams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Anagrams {
    public static List<String> of(String str) {
        if (str.length() == 1) {
            return Collections.singletonList(str);
        }
        List<String> result = new ArrayList<>();
        for (int index = 0; index < str.length(); index++) {
            List<String> anagramsOfTheLeft = Anagrams.of(deleteCharAt(str, index));
            for (String anagramOfTheLeft : anagramsOfTheLeft) {
                result.add(str.charAt(index) + anagramOfTheLeft);
            }
        }
        return result;
    }

    private static String deleteCharAt(String str, int index) {
        return new StringBuilder(str).deleteCharAt(index).toString();
    }
}
