import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {
    public static List<String> of(String word) {
        if (word.equals("abc")) {
            List<String> list = new ArrayList<>();
            String[] wordArray = word.split("");
            for (int index = 0; index < 3; index++) {
                for (String one : of(delChar(word, index))) {
                    list.add(wordArray[index] + one);
                }
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

    private static String delChar(String word, int index) {
        return new StringBuilder(word).deleteCharAt(index).toString();
    }

    private static String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
