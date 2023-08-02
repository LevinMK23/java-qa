package ru.yandex.lesson13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import ru.yandex.lesson8.Cat;

public class Main {

    // sqrt(17)
    // 4 in 2
    public static double sqrt(double n) {
        double l = 0, r = n + 1;
        double eps = 0.000000000001;
        while (r - l > eps) {
            double m = (l + r) / 2.;
            if (m * m <= n) {
                l = m;
            } else {
                r = m;
            }
        }
        return l;
    }

    public static int binarySearch(int[] array, int key) {
        int left = -1, right = array.length;
        while (right - left > 1) {
            int mid = (left + right) / 2;
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] > key) {
                right = mid;
            } else {
                left = mid;
            }
        }
        // return index
        return -1;
    }

    public static int h(int code) {
        return code % 10;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 5, 6, 7};
        Arrays.sort(array);

        char[] hashTable = new char[10];


        for (char c = 'a' + 10; c < 'a' + 20; c++) {
            hashTable[h(c)] = c;
        }

        System.out.println(hashTable[h('a')]);

//        for (int i = 0; i <= 8; i++) {
//            System.out.println(binarySearch(array, i));
//        }

        // 1 custom comparator
        Rectangle r1 = new Rectangle(2, 2);
        Rectangle r2 = new Rectangle(2, 4);

        Rectangle[] data = new Rectangle[5];
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            data[i] = new Rectangle(rnd.nextInt(100), rnd.nextInt(100));
        }

        Comparator<Rectangle> cmp = (a, b) -> a.x * a.y - b.x * b.y;
        Arrays.sort(data);

        for (Rectangle rectangle : data) {
            System.out.println(rectangle);
        }
        // 2 implements comparable


    }

}
