import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
}
