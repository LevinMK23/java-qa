package ru.yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWorkTests {

    @Test
    void testReverseFourDigit() {
        Assertions.assertEquals(4321, HomeWork.reverse(1234));
    }

    @Test
    void testReverseFourDigitWithThreeZeroes() {
        Assertions.assertEquals(1, HomeWork.reverse(1000));
    }

    @Test
    void testDifferenceFourDigit() {
        Assertions.assertEquals(32, HomeWork.difference(4412));
    }

    @Test
    void testDifferenceThreeDigit() {
        Assertions.assertEquals(-8, HomeWork.difference(412));
    }

    @Test
    void testDifferenceTwoDigit() {
        Assertions.assertEquals(-12, HomeWork.difference(12));
    }

    @Test
    void testDifferenceWithTwoZeroes() {
        Assertions.assertEquals(12, HomeWork.difference(1200));
    }

}
