package ru.yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.yandex.lesson3.homework.DigitSum;

public class HomeWorkTests {

    @Test
    void test() {
        HomeWork.reverse(12);
    }

    @Test
    void zeroDigitSumTest() {
        Assertions.assertEquals(0, DigitSum.numberDigitSum(0));
    }

    @Test
    void oneDigitSumTest() {
        Assertions.assertEquals(8, DigitSum.numberDigitSum(8));
    }

    @Test
    void TwoDigitSumTest() {
        Assertions.assertEquals(3, DigitSum.numberDigitSum(12));
    }

    @Test
    void SeveralDigitSumTest() {
        Assertions.assertEquals(6, DigitSum.numberDigitSum(12345));
    }

    @Test
    void sameDigitSumTest() {
        Assertions.assertEquals(9, DigitSum.numberDigitSum(9999999));
    }
}
