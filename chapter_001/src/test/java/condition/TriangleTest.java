package condition;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.condition.Point;
import ru.job4j.condition.Triangle;

@Ignore
public class TriangleTest {
    @Test
    public void whenExist() {
        Point first = new Point(1, 1);
        Point second = new Point(3, 2);
        Point third = new Point(2, 3);
        double expected = 1.5;
        Triangle test = new Triangle(first, second, third);
        Assert.assertEquals(test.area(), expected, 0.01);
    }
    @Test
    public void whenNotExist() {
        Point first = new Point(1, 2);
        Point second = new Point(3, 2);
        Point third = new Point(2, 2);
        double expected = -1.0;
        Triangle test = new Triangle(first, second, third);
        Assert.assertEquals(test.area(), expected, 0.01);
    }
}
