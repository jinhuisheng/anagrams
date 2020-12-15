import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author huisheng.jin
 * @date 2020/12/15.
 */
public class Anagrams {
    public static List<String> of(String word) {
        if (word.length() == 1) {
            return Collections.singletonList(word);
        }
        List<String> result = new ArrayList<>();
        for (int index = 0; index < word.length(); index++) {
            char indexChar = word.charAt(index);
            of(deleteChar(word, index)).forEach(str -> result.add(indexChar + str));
        }
        return result;
    }

    private static String deleteChar(String word, Integer index) {
        return new StringBuilder(word).deleteCharAt(index).toString();
    }

}
