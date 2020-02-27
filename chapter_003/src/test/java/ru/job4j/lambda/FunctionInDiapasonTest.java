package ru.job4j.lambda;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FunctionInDiapasonTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FunctionInDiapason.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = FunctionInDiapason.diapason(5, 8, x -> x * x + 1);
        List<Double> expected = Arrays.asList(26D, 37D, 50D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogarithmicFunctionThenLogarithmicResults() {
        List<Double> temp = FunctionInDiapason.diapason(5, 8, Math::log);
        double[] result = new double[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
           result[i] = temp.get(i);
        }
        double[] expected = {1.61D, 1.79D, 1.95D};
        Assert.assertArrayEquals(result, expected, 0.01D);
    }
}
