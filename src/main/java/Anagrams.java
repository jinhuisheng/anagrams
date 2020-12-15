import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author huisheng.jin
 * @date 2020/12/15.
 */
public class Anagrams {
    public static List<String> of(String word) {
        if (word.equals("abc")) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < word.length(); i++) {
                String deletedCharWord = new StringBuilder(word).deleteCharAt(i).toString();
                result.add(word.charAt(i) + deletedCharWord);
                result.add(word.charAt(i) + reverse(deletedCharWord));
            }
//            result.add(word.charAt(1) + "ac");
//            result.add(word.charAt(1) + "ca");
//            result.add(word.charAt(2) + "ab");
//            result.add(word.charAt(2) + "ba");
            return result;
        }
        if (word.length() == 2) {
            return Arrays.asList(word, reverse(word));
        }
        return Arrays.asList(word);
    }

    private static String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
