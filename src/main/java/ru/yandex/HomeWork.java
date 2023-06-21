package ru.yandex;

import java.util.Arrays;

public class HomeWork {

    public static void main(String[] args) {
        System.out.println(reverse(1234));
        System.out.println(difference(4421));
    }

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
    public static int reverse(int value) {
        // todo
//        Прям как в школе учили))) Просто поэксперементировал
//        int reverseValue = 0;
//        int a = 1000;
//        for (int i = 1; i <= 4; i ++) {
//            reverseValue += (value % 10) * a;
//            value /= 10;
//            a /= 10;
//        }
//        System.out.print(reverseValue);
//        return reverseValue;

        return (value % 10) * 1000 + (value / 10 % 10) * 100 + (value / 100 % 10) * 10 + value / 1000;
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
        // my code
        return value / 100 - value % 100;
    }

}
