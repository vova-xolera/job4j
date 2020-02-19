package ru.job4j.singleton;

import org.junit.Test;
import ru.job4j.tracker.Tracker;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StaticFieldLazyLoadingTest {
    Tracker tracker = StaticFieldLazyLoading.getInstance();
    Tracker tracker2 = StaticFieldLazyLoading.getInstance();

    @Test
    public void ifTwoClasses() {
        assertThat(tracker, is(tracker2));
    }
}
