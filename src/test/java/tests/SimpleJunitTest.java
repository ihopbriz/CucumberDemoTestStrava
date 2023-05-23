package tests;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class SimpleJunitTest {

    @Test
    public void shouldTestSomething() {
        assertThat(1).isEqualTo(1);
    }
}
