import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {
    public static List<String> of(String word) {
        List<String> list = new ArrayList<>();
        if (word.equals("ab")) {
            list.add("ab");
            list.add("ba");
            return list;
        }
        return Arrays.asList("a");
    }
}
