package condition;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.condition.Triangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 3.0);
        assertThat(result, is(true));
    }
    @Test
    public void whenNotExist() {
        boolean result = Triangle.notExist(2.0, 2.0, 4.0);
        assertThat(result, is(true));
    }
}