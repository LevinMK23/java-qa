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
        int reverse = 0;
        while (value != 0) {
            int remainder = value % 10;
            reverse = reverse * 10 + remainder;
            value /= 10;
        }
        if (reverse > 1000 && reverse <= 9999) {
            System.out.println("Ввели 4-ех значное число!");
            System.out.println("Число в обратном порядке: " + reverse);
        }
        // с вводом 1000, получилось только так достичь вывода 1
        else if (reverse == 1) {
            String reversedNumber = new StringBuilder(String.valueOf(reverse)).reverse().toString();
            reversedNumber = reversedNumber.replaceAll("^0+", "");
            System.out.println("Ввели 4-ех значное число!");
            System.out.println("Число в обратном порядке: " + reversedNumber);
        } else {
            System.out.println("Ввели НЕ 4-ех значное число!");
        }

        return 0;
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
        // todo
        // my code
        return 0;
    }

}