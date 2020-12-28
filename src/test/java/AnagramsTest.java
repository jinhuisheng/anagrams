import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class AnagramsTest {
    @Test
    void should_generate_one_char_word() {
        assertThat(Anagrams.of("a")).isEqualTo(Arrays.asList("a"));
    }

    @Test
    void should_generate_two_char_word() {
        assertThat(Anagrams.of("ab")).isEqualTo(Arrays.asList("ab", "ba"));
    }

}
