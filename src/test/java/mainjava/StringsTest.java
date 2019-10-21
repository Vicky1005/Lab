package mainjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StringsTest {

    @ParameterizedTest
    @MethodSource("data")
    @DisplayName("Мой крутой тест")
    public void strings(String stringOne, String two) {
        Assertions.assertEquals(stringOne, two);
    }

     Stream<Arguments> data() {
        return Stream.of(Arguments.of("first", "first"),
                Arguments.of("first", "first"));
    }
}