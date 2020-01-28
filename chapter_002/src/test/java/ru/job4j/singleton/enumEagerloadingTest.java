package ru.job4j.singleton;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class enumEagerloadingTest {
    enumEagerloading tracker = enumEagerloading.INSTANCE;
    enumEagerloading tracker2 = enumEagerloading.INSTANCE;
    @Test
    public void ifTwoClasses() {
        assertThat(tracker, is (tracker2));
    }
}
