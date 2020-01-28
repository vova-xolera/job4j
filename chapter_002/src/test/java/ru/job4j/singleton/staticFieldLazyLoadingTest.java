package ru.job4j.singleton;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class staticFieldLazyLoadingTest {
    staticFieldLazyLoading tracker = staticFieldLazyLoading.getInstance();
    staticFieldLazyLoading tracker2 = staticFieldLazyLoading.getInstance();
    @Test
    public void ifTwoClasses() {
        assertThat(tracker, is (tracker2));
    }
}
