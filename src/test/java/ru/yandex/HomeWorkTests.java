package ru.yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWorkTests {

    @Test
    void checkingReverseFourDigitNumberTest() {
        int actually = HomeWork.reverse(1234);
        int expected = 4321;
        Assertions.assertEquals(expected, actually);
    }

    @Test
    void checkingReverseNotFourDigitNumberTest() {
        int actually = HomeWork.reverse(123);
        int expected = 4321;
        Assertions.assertEquals(expected, actually, "Вы ввели не 4х значное число, переворачивание не выполнен");
    }

    @Test
    void checkDifferenceTest() {
        int actually = HomeWork.difference(2211);
        int expected = 11;
        Assertions.assertEquals(expected, actually);
    }
    @Test
    void checkDifferenceNumbersNotFromNumbersTest() {
        int actually = HomeWork.difference(221);
        int expected = 21;
        Assertions.assertEquals(expected, actually,"Ваше число состоит не из 4х знаков");
    }
    @Test
    void checkDifferenceNumbersСonsistOfZerosTest() {
        int actually = HomeWork.difference(0000);
        int expected = 00;
        Assertions.assertEquals(expected, actually);
    }

    @Test
    void checkNegativeDifferenceTest() {
        int actually = HomeWork.difference(1122);
        int expected = -11;
        Assertions.assertEquals(expected, actually);
    }

}
