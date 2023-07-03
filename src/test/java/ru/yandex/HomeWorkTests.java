package ru.yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWorkTests {

    @Test
    void testReverseHappyPath() {
        int actual = HomeWork.reverse(7364);
        int expected = 4637;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testReverseWithLeadingZeros(){
        int actual = HomeWork.reverse(1070);
        int expected = 701;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void testReverseIncorrectLength(){
        int actual = HomeWork.reverse(10000);
        int expected = 10000;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testReverseNegativeNumber(){
        int actual = HomeWork.reverse(-1024);
        int expected = -4201;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testDifferenceHappyPath(){
        int actual = HomeWork.difference(4515);
        int expected = 30;
        Assertions.assertEquals(expected,actual);
    }

    // Тест считает, а я хотел бы выдавать ошибку, что ввели меньше допустимого
    @Test
    void testDifferenceNegativeNumber(){
        int actual = HomeWork.difference(-9999);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testDifferenceDoubleNumber(){
        int actual = HomeWork.difference(75);
        int expected = -75;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void testDifferenceTripleNumber(){
        int actual = HomeWork.difference(175);
        int expected = -74;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void testDifferenceNegativeResult(){
        int actual = HomeWork.difference(1528);
        int expected = -13;
        Assertions.assertEquals(expected,actual);
    }
}
