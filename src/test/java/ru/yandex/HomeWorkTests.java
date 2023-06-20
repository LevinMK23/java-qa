package ru.yandex;

import org.junit.jupiter.api.Test;

public class HomeWorkTests {

    @Test
    void passTest() {
        HomeWork.reverse(1812);
    }

    @Test
    void errorTest() {
        HomeWork.reverse(42354);
    }

    @Test
    void TestInputThousand() {
        HomeWork.reverse(1000);
    }

}