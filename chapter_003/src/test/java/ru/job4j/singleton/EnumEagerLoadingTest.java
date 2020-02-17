package ru.job4j.singleton;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class EnumEagerLoadingTest {
    EnumEagerLoading tracker = EnumEagerLoading.INSTANCE;
    EnumEagerLoading tracker2 = EnumEagerLoading.INSTANCE;
    @Test
    public void ifTwoClasses() {
        assertThat(tracker, is (tracker2));
    }
}
