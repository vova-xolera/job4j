package ru.job4j.singleton;

import org.junit.Test;
import ru.job4j.tracker.Tracker;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StaticFinalFieldEagerLoadingTest {
    Tracker tracker = StaticFinalFieldEagerLoading.getInstance();
    Tracker tracker2 = StaticFinalFieldEagerLoading.getInstance();

    @Test
    public void ifTwoClasses() {
        assertThat(tracker, is(tracker2));
    }
}
