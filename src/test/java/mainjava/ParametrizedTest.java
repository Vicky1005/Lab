package mainjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class ParametrizedTest {

    @ParameterizedTest
    @ValueSource(ints = {6, 8, 78})
    public void parametr(int argument) {
        Assertions.assertTrue(argument > 0);
    }

    @ParameterizedTest
    @MethodSource("data")
    void someTest(String[] args, double average) {
        double avg = findAverage(args);
        Assertions.assertEquals(average, avg);
    }

    private double findAverage(String[] input) {
        double result = 0;
        for (String s : input) {
            result += Integer.parseInt(s);
        }
        return result/input.length;
    }

    private static Stream<Arguments> data() {
        return Stream.of(Arguments.of(new String[]{"1", "2", "3"}, 2));
    }
}

