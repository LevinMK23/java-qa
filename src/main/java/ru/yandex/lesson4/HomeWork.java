package ru.yandex.lesson4;

public class HomeWork {


    /**
     * Функция должна проверять является ли переданный массив
     * отсортированным.
     * <p>
     * 1 2 3 3 4 5 -> true
     * 1 2 1 5 -> false
     * 5 4 1 -> true
     */
    public static boolean isSorted(int[] array) {
        if (array.length < 2) return false;
        if (array.length == 2) return true;
        for (int i = 1; i < array.length - 1; i++) {
            if ((array[i] >= array[i - 1]) & (array[i] <= array[i + 1])) {
                continue;
            }
            if ((array[i] <= array[i - 1]) & (array[i] >= array[i + 1])) {
                continue;
            }
            return false;
        }
        return true;
    }

    /**
     * Функция должна возвращать максимальное произведение
     * двух элементов массива
     * Массив может состоять как из положительных, так и из
     * отрицательных чисел
     * 1 5 3 1 4 -> 4 * 5 = 20
     */
    public static long maxTwinMultiply(int[] array) {
        if (array.length < 1) return 0;
        if (array.length < 2) return array[0];
        long max = Long.MIN_VALUE;
        long multiply;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                multiply = (long) array[i] * (long) array[j];
                if (multiply > max) max = multiply;
            }
        }
        return max;
    }

    // Две задачи ниже по желанию. Но они интересные

    /**
     * aaaabbbcdd -> 4(a)3(b)1(c)2(d)
     * abc -> 1(a)1(b)1(c)
     * aaaaaaaaaa -> 10(a)
     */
    public static String rleCompress(String src) {
        if (src.length() < 1) return src;
        int count;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < src.length(); i += count) {
            count = 1;
            if (i == src.length() - 1) stringBuilder.append(String.format("%d(%s)", count, src.charAt(i)));
            else {
                for (int j = i + 1; j < src.length(); j++) {
                    if (src.charAt(i) == src.charAt(j)) {
                        count++;
                        if (j == src.length() - 1) stringBuilder.append(String.format("%d(%s)", count, src.charAt(i)));
                    } else {
                        stringBuilder.append(String.format("%d(%s)", count, src.charAt(i)));
                        break;
                    }
                }
            }
        }
        return stringBuilder.toString();
    }


    /**
     * 4(a)3(b)1(c)2(d) -> aaaabbbcdd
     * 1(a)1(b)1(c) -> abc
     * 10(a) -> aaaaaaaaaa
     */
    public static String rleDecompress(String src) {
        return src;
    }
}
