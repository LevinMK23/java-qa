package ru.yandex;

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
     */
    public static int reverse(int value) {
        if (Math.abs(value) <= 999 || Math.abs(value) >= 10000) {
            return value;
        } else {
            int n1 = value / 1000;
            int n2 = value / 100 % 10;
            int n3 = value / 10 % 10;
            int n4 = value % 10;
            return n1 + n2 * 10 + n3 * 100 + n4 * 1000;
        }
    }

    /**
     * Функция должна возвращать разность между
     * числом из двух первых цифр и числом из двух
     * последних. Вам дано число от 10 до 9999
     * Пример: 4412 -> 44 - 12 = 32
     * Написать полное решение, написать тесты,
     * подумать над кейсами
     */
    public static int difference(int value) {
        int n1, n2;
        if (value <= 9 || value >= 10000) {
            return value;
        } else if (value <= 99) {
            return 0;
        } else if (value <= 999) {
            n1 = value / 10;
            n2 = value % 100;
        } else {
            n1 = value / 100;
            n2 = value % 100;
        }
        return n1 - n2;
    }

}
