import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class AnagramsTest {
    @Test
    void generate_one() {
        assertThat(Anagrams.of("a")).isEqualTo(Arrays.asList("a"));
    }

    @Test
    void generate_two() {
        assertThat(Anagrams.of("ab")).isEqualTo(Arrays.asList("ab", "ba"));
    }

    @Test
    void generate_three() {
        assertThat(Anagrams.of("abc")).isEqualTo(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba"));
    }

    @Test
    void generate_four() {
        assertThat(Anagrams.of("biro")).isEqualTo(Arrays.asList(
                "biro", "bior", "brio", "broi", "boir", "bori",
                "ibro", "ibor", "irbo", "irob", "iobr", "iorb",
                "rbio", "rboi", "ribo", "riob", "robi", "roib",
                "obir", "obri", "oibr", "oirb", "orbi", "orib"));
    }



}
