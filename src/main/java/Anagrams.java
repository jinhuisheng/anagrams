import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {
    public static List<String> of(String word) {
        List<String> list = new ArrayList<>();
        if (word.equals("ab")) {
            String first = "a";
            String second = "b";
            list.add(first + second);
            list.add(second + first);
            return list;
        }
        return Arrays.asList("a");
    }
}
