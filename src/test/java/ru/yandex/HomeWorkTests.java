package ru.yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWorkTests {

    @Test
    void testReverse1() {
        // Позитивная проверка
        int value = 4321;
        int expected = 1234;
        int actual = HomeWork.reverse(value);
        Assertions.assertEquals(expected, actual, "Значения не совпадают, для " + value);
    }

    @Test
    void testReverse2() {
        // Число меньше 1000
        int value = 999;
        int expected = 999;
        int actual = HomeWork.reverse(value);
        Assertions.assertEquals(expected, actual, "Значения не совпадают, для " + value);
    }

    @Test
    void testReverse3() {
        // Число больше 9999
        int value = 10000;
        int expected = 10000;
        int actual = HomeWork.reverse(value);
        Assertions.assertEquals(expected, actual, "Значения не совпадают, для " + value);
    }

    @Test
    void testReverse4() {
        // Не значащие нули
        int value = 1000;
        int expected = 1;
        int actual = HomeWork.reverse(value);
        Assertions.assertEquals(expected, actual, "Значения не совпадают, для " + value);
    }

    @Test
    void testReverse5() {
        // Ноль
        int value = 0;
        int expected = 0;
        int actual = HomeWork.reverse(value);
        Assertions.assertEquals(expected, actual, "Значения не совпадают, для " + value);
    }

    @Test
    void testReverse6() {
        // Отрицательное число
        int value = -4321;
        int expected = -1234;
        int actual = HomeWork.reverse(value);
        Assertions.assertEquals(expected, actual, "Значения не совпадают, для " + value);
    }

    @Test
    void testReverse7() {
        // Отрицательное число меньше 1000
        int value = -899;
        int expected = -899;
        int actual = HomeWork.reverse(value);
        Assertions.assertEquals(expected, actual, "Значения не совпадают, для " + value);
    }

    @Test
    void testDifference1() {
        // Позитивная проверка четырёхзначного числа
        int value = 4412;
        int expected = 44 - 12;
        int actual = HomeWork.difference(value);
        Assertions.assertEquals(expected, actual, "Значения не совпадают, для " + value);
    }

    @Test
    void testDifference2() {
        // Позитивная проверка трёхзначного числа
        int value = 441;
        int expected = 44 - 41;
        int actual = HomeWork.difference(value);
        Assertions.assertEquals(expected, actual, "Значения не совпадают, для " + value);
    }

    @Test
    void testDifference3() {
        // Позитивная проверка двухзначного числа
        int value = 41;
        int expected = 0;
        int actual = HomeWork.difference(value);
        Assertions.assertEquals(expected, actual, "Значения не совпадают, для " + value);
    }

    @Test
    void testDifference4() {
        // Отрицательный ответ
        int value = 1234;
        int expected = 12 - 34;
        int actual = HomeWork.difference(value);
        Assertions.assertEquals(expected, actual, "Значения не совпадают, для " + value);
    }

    @Test
    void testDifference5() {
        // Ноль
        int value = 0;
        int expected = 0;
        int actual = HomeWork.difference(value);
        Assertions.assertEquals(expected, actual, "Значения не совпадают, для " + value);
    }

    @Test
    void testDifference6() {
        // Одна цифра
        int value = 9;
        int expected = 9;
        int actual = HomeWork.difference(value);
        Assertions.assertEquals(expected, actual, "Значения не совпадают, для " + value);
    }

    @Test
    void testDifference7() {
        // Пятизначное число
        int value = 12121;
        int expected = 12121;
        int actual = HomeWork.difference(value);
        Assertions.assertEquals(expected, actual, "Значения не совпадают, для " + value);
    }
}
