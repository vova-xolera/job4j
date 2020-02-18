package condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;


public class PointTest {

    @Test
    public void distance() {
        int x1_In = 2;
        int y1_In = 0;
        int x2_In = -1;
        int y2_In = 4;
        Point point1 = new Point(x1_In, y1_In);
        Point point2 = new Point(x2_In, y2_In);
        double out = point1.distance(point2);
        double expected = 5.0D;
        Assert.assertEquals(expected, out, 0.01D);
    }

    @Test
    public void distance3D() {
        int x1_In = 2;
        int y1_In = 0;
        int z1_In = 0;
        int x2_In = -1;
        int y2_In = 4;
        int z2_In = 0;
        Point point1 = new Point(x1_In, y1_In, z1_In);
        Point point2 = new Point(x2_In, y2_In, z2_In);
        double out = point1.distance(point2);
        double expected = 5.0D;
        Assert.assertEquals(expected, out, 0.01D);
    }
}