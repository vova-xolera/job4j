package condition;


import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenEqualThen2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenEqualToAll3() {
        int result = Max.max(2, 2,2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax3To1Then3() {
        int result = Max.max(2, 2, 5);
        assertThat(result, is(5));
    }
    @Test
    public void whenMax1To3Then3() {
        int result = Max.max(12, 2, 5);
        assertThat(result, is(12));
    }
    @Test
    public void whenEqualToAll4() {
        int result = Max.max(2, 2,2,2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax4To1Then4() {
        int result = Max.max(2, 2, 5, 12);
        assertThat(result, is(12));
    }
    @Test
    public void whenMax1To4Then4() {
        int result = Max.max(12, 2, 5, 7);
        assertThat(result, is(12));
    }
}