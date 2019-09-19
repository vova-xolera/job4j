package loop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.loop.Counter;

public class CounterTest {


        @Test
        public void whenSumEvenNumbersFromOneToTenThenThirty() {

                int start = 1;
                int finish = 10;
                int expected = 30;
                int out = Counter.add(start, finish);
                Assert.assertEquals((long)expected, (long)out);

        }
}

