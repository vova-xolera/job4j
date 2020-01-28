package ru.job4j.singleton;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class privateStaticFinalClassLazyLoadingTest {
    privateStaticFinalClassLazyLoading tracker = privateStaticFinalClassLazyLoading.getInstance();
    privateStaticFinalClassLazyLoading tracker2 = privateStaticFinalClassLazyLoading.getInstance();
    @Test
    public void ifTwoClasses() {
        assertThat(tracker, is (tracker2));
    }
}

