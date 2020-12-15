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
    void should_one_word_success() {
        List<String> result = Anagrams.of("a");
        assertThat(result).isEqualTo(Arrays.asList("a"));
    }
}
