package ru.job4j.singleton;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class staticFinalFieldEagerLoadingTest {
    staticFinalFieldEagerLoading tracker = staticFinalFieldEagerLoading.getInstance();
    staticFinalFieldEagerLoading tracker2 = staticFinalFieldEagerLoading.getInstance();
    @Test
    public void ifTwoClasses() {
        assertThat(tracker, is (tracker2));
    }
}
