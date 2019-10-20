package mainjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizedTest {

    @ParameterizedTest
    @ValueSource(ints={6, 8, 78})
    public void parametr(int argument) {
        Assertions.assertTrue(argument>0);
    }
}
