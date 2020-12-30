package anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Anagrams {
    public static List<String> generate(String str) {
        if (str.length() == 1) {
            return Arrays.asList(str);
        }
        List<String> result = new ArrayList<>();
        for (int index = 0; index < str.length(); index++) {
            for (String anagram : generate(deleteChar(str, index))) {
                String newAnagram = str.charAt(index) + anagram;
                result.add(newAnagram);
            }
        }
        return result;
    }

    private static String deleteChar(String str, int index) {
        return new StringBuilder(str).deleteCharAt(index).toString();
    }
}
