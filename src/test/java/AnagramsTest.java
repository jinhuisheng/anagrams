import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/12/15.
 */
public class AnagramsTest {

    @Test
    void should_parse_one_character_success() {
        assertThat(Anagrams.of("a")).isEqualTo(Arrays.asList("a"));
    }

    @Test
    void should_parse_two_character_success() {
        assertThat(Anagrams.of("ab")).isEqualTo(Arrays.asList("ab", "ba"));
    }

    @Test
    void should_parse_three_character_success() {
        assertThat(Anagrams.of("abc")).isEqualTo(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba"));
    }

    @Test
    void should_parse_four_character_success() {
        assertThat(Anagrams.of("biro")).isEqualTo(Arrays.asList(
                "biro", "bior", "brio", "broi", "boir", "bori",
                "ibro", "ibor", "irbo", "irob", "iobr", "iorb",
                "rbio", "rboi", "ribo", "riob", "robi", "roib",
                "obir", "obri", "oibr", "oirb", "orbi", "orib"));
    }


}
