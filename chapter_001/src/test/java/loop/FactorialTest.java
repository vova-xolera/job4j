package loop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.loop.Factirial;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int in = 5;
        int out = Factirial.calc(in);
        int excepted = 120;
        Assert.assertEquals(excepted, out);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int out = Factirial.calc(in);
        int excepted = 1;
        Assert.assertEquals(excepted, out);
    }
}
