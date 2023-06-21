package ru.yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWorkTests {

    @Test
    void testReverse0() {
        int actually = HomeWork.reverse(1234);
        int expected = 4321;
        Assertions.assertEquals(expected, actually);
    }
    @Test
    void testReverse1() {
        int actually = HomeWork.reverse(123);
        int expected = 321;
        Assertions.assertEquals(expected, actually);
    }
    @Test
    void testReverse3() {
        int actually = HomeWork.reverse(12345);
        int expected = 54321;
        Assertions.assertEquals(expected, actually);
    }
    @Test
    void testReverse4() {
        int actually = HomeWork.reverse(-52);
        int expected = -25;
        Assertions.assertEquals(expected, actually);
    }
    @Test
    void testDifference1() {
        int actually = HomeWork.difference(3452);
        int expected = -18;
        Assertions.assertEquals(expected, actually);
    }
    @Test
    void testDifference2() {
        int actually = HomeWork.difference(-3452);
        int expected = 18;
        Assertions.assertEquals(expected, actually);
    }
    @Test
    void testDifference3() {
        int actually = HomeWork.difference(4444);
        int expected = 0;
        Assertions.assertEquals(expected, actually);
    }
    @Test
    void testDifference4() {
        int actually = HomeWork.difference(52);
        int expected = 3;
        Assertions.assertEquals(expected, actually);
        //везде, где упавшие тесты - там я ругаю себя за говнокод)
    }

}

