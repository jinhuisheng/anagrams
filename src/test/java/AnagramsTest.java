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
    void should_one_char_word_generate_success() {
        assertThat(Anagrams.of("a")).isEqualTo(Arrays.asList("a"));
    }

    @Test
    void should_two_char_word_generate_success() {
        assertThat(Anagrams.of("ab")).isEqualTo(Arrays.asList("ab", "ba"));
    }

    @Test
    void should_three_char_word_generate_success() {
        assertThat(Anagrams.of("abc")).isEqualTo(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba"));
    }

    @Test
    void should_four_char_word_generate_success() {
        List<String> result = Anagrams.of("abcd");
        assertThat(result.size()).isEqualTo(24);
    }


}
