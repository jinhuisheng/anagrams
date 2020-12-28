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

    @Test
    void should_generate_three_char_word() {
        assertThat(Anagrams.of("abc")).isEqualTo(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba"));
    }

    @Test
    void should_generate_four_char_word() {
        assertThat(Anagrams.of("biro")).isEqualTo(Arrays.asList(
                "biro", "bior", "brio", "broi", "boir", "bori",
                "ibro", "ibor", "irbo", "irob", "iobr", "iorb",
                "rbio", "rboi", "ribo", "riob", "robi", "roib",
                "obir", "obri", "oibr", "oirb", "orbi", "orib"
        ));
    }


}
