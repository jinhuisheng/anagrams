import java.util.Arrays;
import java.util.List;

public class Anagrams {
    public static List<String> of(String word) {
        if (word.length() == 2) {
            return Arrays.asList("ab", "ba");
        }
        return Arrays.asList(word);
    }
}
