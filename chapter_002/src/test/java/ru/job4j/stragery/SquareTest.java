package ru.job4j.stragery;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SquareTest {
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
                is(
                        new StringBuilder()
                                .append("++++")
                                .append("\n")
                                .append("+  +")
                                .append("\n")
                                .append("+  +")
                                .append("\n")
                                .append("++++")
                                .toString()
                )
        );
    }
}
