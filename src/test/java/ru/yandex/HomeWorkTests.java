package ru.yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWorkTests {

    @Test
    void testIsReversed() {
        int value = 2345;
        int actual = HomeWork.reverse(value);
        int expected = 5432;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIsFourSymbols(){
        int value = 9871;
        int numDigits = String.valueOf(value).length();
        if (numDigits == 4) {
            int actual = HomeWork.reverse(value);
            int expected = 1789;
            Assertions.assertEquals(expected, actual);
        }
        {
            System.out.println("Введенное число содержит не подходящее количество символов");
        }
    }

    @Test
    void testCountDifference(){
        int number = 5511;
        int expected = 44;
        int actual = HomeWork.difference(number);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCountDifferenceBoard1() {
        int number = 10;
        int expected = -10;
        int actual = HomeWork.difference(number);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCountDifferenceBoard2() {
        int number = 9999;
        int expected = 0;
        int actual = HomeWork.difference(number);
        Assertions.assertEquals(expected, actual);
    }

}
