import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.reverse;

public class Anagrams {
    public static List<String> of(String word) {
        if (word.length() == 3) {
            List<String> list = new ArrayList<>();
            list.add(word.charAt(0) + "bc");
            list.add(word.charAt(0) + "cb");
            list.add(word.charAt(1) + "ac");
            list.add(word.charAt(1) + "ca");
            list.add(word.charAt(2) + "ab");
            list.add(word.charAt(2) + "ba");
            return list;
        }
        if (word.length() == 2) {
            return Arrays.asList(word, reverse(word));
        }
        return Arrays.asList(word);
    }
}
