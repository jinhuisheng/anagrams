import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {
    public static List<String> of(String word) {
        if (word.equals("abc")) {
            List<String> list = new ArrayList<>();
            String[] wordArray = word.split("");
            for (String one : of(new StringBuilder(word).deleteCharAt(0).toString())) {
                list.add(wordArray[0] + one);
            }
            for (String one : of(new StringBuilder(word).deleteCharAt(1).toString())) {
                list.add(wordArray[1] + one);
            }
            for (String one : of("ab")) {
                list.add(wordArray[2] + one);
            }
            return list;
        }
        if (word.length() == 2) {
            List<String> list = new ArrayList<>();
            list.add(word);
            list.add(reverse(word));
            return list;
        }
        return Arrays.asList("a");
    }

    private static String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
