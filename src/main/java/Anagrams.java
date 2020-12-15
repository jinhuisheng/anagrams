import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author huisheng.jin
 * @date 2020/12/15.
 */
public class Anagrams {
    private String word;
    private List<String> result;

    public Anagrams(String word) {
        this.result = new ArrayList<>();
        this.word = word;
    }

    public static List<String> of(String word) {
        Anagrams anagrams = new Anagrams(word);
        return anagrams.of();
    }

    private List<String> of() {
        if (word.length() == 1) {
            return Collections.singletonList(word);
        }
        for (int index = 0; index < word.length(); index++) {
            add(index);
        }
        return result;
    }

    private void add(int i) {
        char currentChar = word.charAt(i);
        String deletedCharWord = new StringBuilder(word).deleteCharAt(i).toString();
        List<String> deletedCharWordResult = of(deletedCharWord);
        List<String> collect = deletedCharWordResult.stream()
                .map(str -> currentChar + str)
                .collect(Collectors.toList());
        result.addAll(collect);
    }

}
