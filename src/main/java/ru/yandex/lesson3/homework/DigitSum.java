package ru.yandex.lesson3.homework;

public class DigitSum {

    public static void main(String[] args) {
        System.out.println(numberDigitSum(12345));
    }
    public static int numberDigitSum (long number) {
        int sum;
        while (number > 9) {
            sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        return (int) number;
    }
}
