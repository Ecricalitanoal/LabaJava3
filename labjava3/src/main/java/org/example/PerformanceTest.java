package org.example;

import java.util.List;

public class PerformanceTest {

    public static long addTest(List<Integer> list, int countOfOperations) {

        long start = System.nanoTime();

        for (int i = 0; i < countOfOperations; i++) {
            list.add(i);
        }
        return System.nanoTime() - start;
    }

    public static long getTest(List<Integer> list, int countOfOperations) {

        long start = System.nanoTime();

        for (int i = 0; i < countOfOperations; i++) {
            list.get(i);
        }
        return System.nanoTime() - start;
    }

    public static long deleteTest(List<Integer> list, int countOfOperations) {

        long start = System.nanoTime();

        for (int i = 0; i < countOfOperations; i++) {
            list.remove(0);
        }
        return System.nanoTime() - start;
    }
}
