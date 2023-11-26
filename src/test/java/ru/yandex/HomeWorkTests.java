package ru.yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.yandex.lesson4.HomeWork;

public class HomeWorkTests {
    @Test
    void isSortedTest1() {
        Assertions.assertTrue(HomeWork.isSorted(new int[]{1, 2, 3}));
    }

    @Test
    void isSortedTest2() {
        Assertions.assertFalse(HomeWork.isSorted(new int[]{1, 2, 3, -5}));
    }

    @Test
    void isSortedTest3() {
        Assertions.assertFalse(HomeWork.isSorted(new int[]{}));
    }

    @Test
    void isSortedTest4() {
        Assertions.assertFalse(HomeWork.isSorted(new int[]{-1}));
    }

    @Test
    void isSortedTest5() {
        Assertions.assertFalse(HomeWork.isSorted(new int[]{-1, -3, 0}));
    }

    @Test
    void isSortedTest6() {
        Assertions.assertTrue(HomeWork.isSorted(new int[]{-1, -3, -7}));
    }

    @Test
    void isSortedTest7() {
        Assertions.assertTrue(HomeWork.isSorted(new int[]{-1, 3, 7}));
    }

    @Test
    void isSortedTest8() {
        Assertions.assertTrue(HomeWork.isSorted(new int[]{3, 3, 3}));
    }

    @Test
    void isSortedTest9() {
        Assertions.assertTrue(HomeWork.isSorted(new int[]{10, 5, 4}));
    }

    @Test
    void isSortedTest10() {
        Assertions.assertTrue(HomeWork.isSorted(new int[]{1, 2, 3, 3, 4, 5}));
    }

    @Test
    void maxTwinMultiplyTest1() {
        Assertions.assertEquals(20, HomeWork.maxTwinMultiply(new int[]{1, 5, 3, 1, 4}));
    }

    @Test
    void maxTwinMultiplyTest2() {
        Assertions.assertEquals(20, HomeWork.maxTwinMultiply(new int[]{-1, -5, -3, -1, -4}));
    }

    @Test
    void maxTwinMultiplyTest3() {
        Assertions.assertEquals(1, HomeWork.maxTwinMultiply(new int[]{-1, 5, -1}));
    }

    @Test
    void maxTwinMultiplyTest4() {
        Assertions.assertEquals(5, HomeWork.maxTwinMultiply(new int[]{5}));
    }

    @Test
    void maxTwinMultiplyTest5() {
        Assertions.assertEquals(0, HomeWork.maxTwinMultiply(new int[]{}));
    }

    @Test
    void maxTwinMultiplyTest6() {
        Assertions.assertEquals(6, HomeWork.maxTwinMultiply(new int[]{3, 2}));
    }

    @Test
    void maxTwinMultiplyTest7() {
        Assertions.assertEquals(3L * Integer.MAX_VALUE, HomeWork.maxTwinMultiply(new int[]{3, Integer.MAX_VALUE}));
    }

    @Test
    void rleCompressTest1() {
        Assertions.assertEquals("4(a)3(b)1(c)2(d)", HomeWork.rleCompress("aaaabbbcdd"));
    }

    @Test
    void rleCompressTest2() {
        Assertions.assertEquals("1(a)1(b)1(c)", HomeWork.rleCompress("abc"));
    }

    @Test
    void rleCompressTest3() {
        Assertions.assertEquals("10(a)", HomeWork.rleCompress("aaaaaaaaaa"));
    }

    @Test
    void rleCompressTest4() {
        Assertions.assertEquals("1(a)", HomeWork.rleCompress("a"));
    }

    @Test
    void rleCompressTest5() {
        Assertions.assertEquals("", HomeWork.rleCompress(""));
    }
}
