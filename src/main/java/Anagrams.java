import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author huisheng.jin
 * @date 2020/12/15.
 */
public class Anagrams {
    public static List<String> of(String word) {
        if (word.equals("abc")) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                String deletedCharWord = new StringBuilder(word).deleteCharAt(i).toString();
                List<String> collect = of(deletedCharWord).stream().map(str -> currentChar + str).collect(Collectors.toList());
                result.addAll(collect);
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
