package ru.yandex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class HomeWorkTests {

    @Test
    void passTest() {
        int actually = HomeWork.reverse(1234);
        int expected = 4321;
        Assertions.assertEquals(expected, actually, "Ошибка: ожидаемый результат: " + expected + ", фактический: " + actually);
    }

    @Test
    void test() {
        int actually = HomeWork.reverse(1000);
        int expected = 1;
        Assertions.assertEquals(expected, actually, "Ошибка: ожидаемый результат: " + expected + ", фактический: " + actually);
    }

    @Test
    void test2() {
        int actually = HomeWork.reverse(0001);
        int expected = 1;
        Assertions.assertEquals(expected, actually, "Ошибка: ожидаемый результат: " + expected + ", фактический: " + actually);
    }

    @Test
    void test3() {
        int actually = HomeWork.reverse(-1234);
        int expected = 4321;
        Assertions.assertEquals(expected, actually, "Ошибка: ожидаемый результат: " + expected + ", фактический: " + actually);
    }

    @Test
    void failedTest() {
        int actually = HomeWork.reverse(4567);
        int expected = 1234;
        Assertions.assertEquals(expected, actually, "Ошибка: ожидаемый результат: " + expected + ", фактический: " + actually);
    }

    @Test
    void failTest() {
        int actually = HomeWork.difference(4412);
        int expected = 32;
        Assertions.assertEquals(expected, actually, "Ошибка: ожидаемый результат: " + expected + ", фактический: " + actually);
    }

    @Test
    void test4() {
        int actually = HomeWork.difference(1312);
        int expected = 10;
        Assertions.assertEquals(expected, actually, "Ошибка: ожидаемый результат: " + expected + ", фактический: " + actually);
    }



}



