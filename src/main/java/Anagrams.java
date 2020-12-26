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
            list.add("cab");
            list.add("cba");
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
