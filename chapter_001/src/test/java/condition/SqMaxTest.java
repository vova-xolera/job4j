package condition;

import org.junit.Test;
import ru.job4j.condition.SqMax;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void when1MoreWhenOthers() {
        int first = 5;
        int second = 4;
        int third = 3;
        int forth = 2;
        int expected = 5;
        int s = SqMax.max(first, second, third, forth);
        assertThat(s, is(expected));
    }

    @Test
    public void when2MoreWhenOthers() {
        int first = 5;
        int second = 9;
        int third = 3;
        int forth = 2;
        int expected = 9;
        int s = SqMax.max(first, second, third, forth);
        assertThat(s, is(expected));
    }

    @Test
    public void when3MoreWhenOthers() {
        int first = 5;
        int second = 4;
        int third = 7;
        int forth = 6;
        int expected = 7;
        int s = SqMax.max(first, second, third, forth);
        assertThat(s, is(expected));
    }

    @Test
    public void when4MoreWhenOthers() {
        int first = 5;
        int second = 5;
        int third = 6;
        int forth = 10;
        int expected = 10;
        int s = SqMax.max(first, second, third, forth);
        assertThat(s, is(expected));
    }

    @Test
    public void whenAllEquals() {
        int first = 5;
        int second = 5;
        int third = 5;
        int forth = 5;
        int expected = 5;
        int s = SqMax.max(first, second, third, forth);
        assertThat(s, is(expected));
    }

}
