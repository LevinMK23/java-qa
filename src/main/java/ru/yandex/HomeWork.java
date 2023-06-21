package ru.yandex;

import java.util.List;

public class HomeWork {

    /**
     * Функция получает на вход 4-х значное число
     * Функция должна вернуть число в обратном порядке
     * Например дано 1234, тогда необходимо вывести 4321
     * <p>
     * Необходимо написать реализацию, а так же написать
     * тесты (подумайте над кейсами)
     * <p>
     * 1000 -> 1 (это называется не значащие нули)
     * */
        static int reverse(int value) {
        // todo
        int num1 = value / 1000 , num2 = (value / 100) % 10 , num3 = (value / 10) % 10 , num4 = value % 10;
        int reversedNum = Integer.valueOf(String.valueOf(num4) + String.valueOf(num3) + String.valueOf(num2) + String.valueOf(num1));
        return reversedNum;

    }

    /**
     * Функция должна возвращать разность между
     * числом из двух первых цифр и числом из двух
     * последних. Вам дано число от 10 до 9999
     * Пример: 4412 -> 44 - 12 = 32
     * Написать полное решение, написать тесты,
     * подумать над кейсами
     * */
    public static int difference(int value) {
        // todo
        int num1 = value / 100, num2 = value % 100;
        int result = num1 - num2;
        return result;
    }

}
