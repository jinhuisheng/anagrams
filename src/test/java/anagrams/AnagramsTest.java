package anagrams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AnagramsTest {
    @Test
    void should_generate_one_char_string() {
        assertThat(Anagrams.of("a")).isEqualTo(Arrays.asList("a"));
    }

    @Test
    void should_generate_two_char_string() {
        assertThat(Anagrams.of("ab")).isEqualTo(Arrays.asList("ab", "ba"));
    }

    @Test
    void should_generate_three_char_string() {
        List<String> result = Anagrams.of("abcd");
        assertThat(result.size()).isEqualTo(24);
    }


}
