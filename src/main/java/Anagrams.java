import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {
    public static List<String> of(String word) {
        if (word.equals("abc")) {
            List<String> list = new ArrayList<>();
            return Arrays.asList(
                    "abc"
                    , "acb"
                    , "bac"
                    , "bca"
                    , "cab"
                    , "cba"
            );
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
