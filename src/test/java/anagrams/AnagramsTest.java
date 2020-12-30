package anagrams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AnagramsTest {
    @Test
    void should_generate_one_char_string() {
        assertThat(Anagrams.generate("a")).isEqualTo(Arrays.asList("a"));
    }

    @Test
    void should_generate_two_char_string() {
        assertThat(Anagrams.generate("ab")).isEqualTo(Arrays.asList("ab", "ba"));
    }

    @Test
    void should_generate_three_char_string() {
        assertThat(Anagrams.generate("abc")).isEqualTo(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba"));
    }

    @Test
    void should_generate_four_char_string() {
        List<String> anagrams = Anagrams.generate("biro");
        assertThat(anagrams.size()).isEqualTo(24);
        assertThat(anagrams.get(0)).isEqualTo("biro");
        assertThat(anagrams.get(23)).isEqualTo("orib");
    }


}
