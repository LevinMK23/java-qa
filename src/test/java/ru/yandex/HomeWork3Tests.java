package ru.yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.yandex.lesson3.homework.HomeWork;

public class HomeWork3Tests {

    @ParameterizedTest
    @CsvSource(value = {
            "12345, 6",
            "1, 1",
            "0, 0",
            "123, 6",
            "9999999, 9",
            "-10, 1",
            "-1, 1",
            "-9, 9",
            "10, 1",
            "9, 9",
            "1234, 1"
    })
    public void testSumDigitsOfNumber(long value, long expectedResult) {
        Assertions.assertEquals(expectedResult, HomeWork.sumDigitsOfNumber(value));
    }
}
