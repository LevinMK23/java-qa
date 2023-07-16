package ru.yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWorkTests {

    @Test
    void test() {
        int actually = HomeWork.reverse(1234);
        int expected = 4321;
        Assertions.assertEquals(expected, actually);
    }

    @Test
    void test2() {
        int actually = HomeWork.reverse(1289);
        int expected = 9821;
        Assertions.assertEquals(expected,actually);
    }

    @Test
    void test3() {
        int actually = HomeWork.difference(9030);
        int expected = 60;
        Assertions.assertEquals(expected,actually);
    }

    @Test
    void test4() {
        int actually = HomeWork.difference(1234);
        int expected = -22;
        Assertions.assertEquals(expected,actually);
    }
}
