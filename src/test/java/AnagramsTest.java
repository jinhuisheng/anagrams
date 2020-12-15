import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/12/15.
 */
public class AnagramsTest {
    @Test
    void should_one_char_word_success() {
        List<String> result = Anagrams.of("a");
        assertThat(result).isEqualTo(Arrays.asList("a"));
    }

    @Test
    void should_generate_two_char_word_success() {
        List<String> result = Anagrams.of("ab");
        assertThat(result).isEqualTo(Arrays.asList("ab", "ba"));
    }

    @Test
    void should_generate_three_char_word_success() {
        List<String> result = Anagrams.of("abc");
        assertThat(result).isEqualTo(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba"));
    }


}
