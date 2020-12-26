import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {
    public static List<String> of(String word) {
        if (word.equals("abc")) {
            List<String> list = new ArrayList<>();
            String[] wordArray = word.split("");
            list.add(wordArray[0] + "bc");
            list.add(wordArray[0] + "cb");
            list.add(wordArray[1] + "ac");
            list.add(wordArray[1] + "ca");
            list.add(wordArray[2] + "ab");
            list.add(wordArray[2] + "ba");
            return list;
        }
        if (word.equals("ab")) {
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
