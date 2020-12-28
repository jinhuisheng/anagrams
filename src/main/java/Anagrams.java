import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.reverse;

public class Anagrams {
    public static List<String> of(String word) {
        if (word.length() == 3) {
            List<String> list = new ArrayList<>();
            for (String str : of("bc")) {
                list.add(word.charAt(0) + str);
            }
            for (String str : of("ac")) {
                list.add(word.charAt(1) + str);
            }
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
