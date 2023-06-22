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
     * */
    public static int reverse(int value) {
        if (Math.abs(value) < 1000 || Math.abs(value) > 9999)
            return reverseMessage(value);
        int reverseValue = ((value % 10) * 1000 + ((value / 10) % 10) * 100 + ((value / 100) % 10) * 10 + (value / 1000));
        System.out.println(reverseValue);
        return reverseValue;
    }

     public static int reverseMessage(int value){
        System.out.println("Введите 4-х значное число");
         return value;
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
        if (Math.abs(value) < 10 || Math.abs(value) > 9999)
            return differenceMessage(value);
        int differenceValue = (value / 100) - (value % 100);
        System.out.println(differenceValue);
        return differenceValue;
    }
    // Пока не получается кидать ошибку, если вводят отрицательное число
    public static int differenceMessage(int value){
        System.out.println("Введите число от 10 до 9999");
        return value;
    }

}
