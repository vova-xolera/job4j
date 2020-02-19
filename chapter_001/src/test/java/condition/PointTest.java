package condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;


public class PointTest {

    @Test
    public void distance() {
        int x1In = 2;
        int y1In = 0;
        int x2In = -1;
        int y2In = 4;
        Point point1 = new Point(x1In, y1In);
        Point point2 = new Point(x2In, y2In);
        double out = point1.distance(point2);
        double expected = 5.0D;
        Assert.assertEquals(expected, out, 0.01D);
    }

    @Test
    public void distance3D() {
        int x1In = 2;
        int y1In = 0;
        int z1In = 0;
        int x2In = -1;
        int y2In = 4;
        int z2In = 0;
        Point point1 = new Point(x1In, y1In, z1In);
        Point point2 = new Point(x2In, y2In, z2In);
        double out = point1.distance(point2);
        double expected = 5.0D;
        Assert.assertEquals(expected, out, 0.01D);
    }
}