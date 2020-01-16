package ru.job4j.stragery;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TriangleTest {
    @Test
    public void whenDrawSquare() {
        Triangle triangle = new Triangle();
        assertThat(
                triangle.draw(),
                is(
                        new StringBuilder()
                                .append("+++++++")
                                .append(System.lineSeparator())
                                .append(" +   +")
                                .append(System.lineSeparator())
                                .append("  + +")
                                .append(System.lineSeparator())
                                .append("   +")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }
}
