package ru.yandex;

import org.junit.jupiter.api.Test;

public class HomeWorkTests {

    @Test
    void PassTest() {
        HomeWork.reverse(1356);
    }

    @Test
    void TestInputThousand() {
        HomeWork.reverse(1000);
    }

    @Test
    void InputMoreFourNumber() {
        HomeWork.reverse(42354);

    }
    @Test
    void InputLessFourNumber() {
        HomeWork.reverse(423);
    }

    @Test
    void inputZeroBefore() {
        HomeWork.reverse(0020);
    }




    @Test
    void Test() {
        HomeWork.difference(1000);

    }

}