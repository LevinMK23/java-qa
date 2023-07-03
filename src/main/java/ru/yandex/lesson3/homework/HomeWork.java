package ru.yandex.lesson3.homework;

//Дано целое число типа long
//12345 = 1 + 2 + 3 + 4 + 5 => 15 = 1 + 5 => 6
//1 = 1
//0 = 0
//123 = 6
//9999999 = 6 + 3 = 9
//
//Создать класс, написать в нем статический метод, написать тесты на метод
//Метод должен считать сумму цифр числа до тех пор, пока сумма не станет цифрой
public class HomeWork {
    public static long sumDigitsOfNumber(long number) {
        number = Math.abs(number);
        long result = number;
        while (number > 9) {
            result = 0;
            for (long i = number; i > 0; i = i / 10) {
                result += i % 10;
            }
            number = result;
        }
        return result;
    }
}
