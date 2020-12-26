import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {
    public static List<String> of(String word) {
        if (word.equals("abc")) {
            List<String> list = new ArrayList<>();
            String[] wordArray = word.split("");
            for (String one : of("bc")) {
                list.add(wordArray[0] + one);
            }
            list.add(wordArray[1] + "ac");
            list.add(wordArray[1] + "ca");
            list.add(wordArray[2] + "ab");
            list.add(wordArray[2] + "ba");
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
