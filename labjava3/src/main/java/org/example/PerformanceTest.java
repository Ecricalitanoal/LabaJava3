package org.example;

import java.util.List;

/**
 * Утилитный класс для тестирования производительности операций List.
 * Предоставляет методы для измерения времени выполнения операций добавления,
 * получения и удаления элементов для заданной реализации List.
 */
public class PerformanceTest {

    /**
     * Измеряет время, затраченное на добавление элементов в конец списка.
     *
     * @param list список, над которым выполняются операции добавления
     * @param countOfOperations количество операций добавления
     * @return время в наносекундах, затраченное на все операции добавления
     * @throws NullPointerException если переданный список равен null
     */
    public static long addTest(List<Integer> list, int countOfOperations) {
        long start = System.nanoTime();

        for (int i = 0; i < countOfOperations; i++) {
            list.add(i);
        }
        return System.nanoTime() - start;
    }

    /**
     * Измеряет время, затраченное на получение элементов из списка по индексу.
     *
     * @param list список, над которым выполняются операции получения
     * @param countOfOperations количество операций получения
     * @return время в наносекундах, затраченное на все операции получения
     * @throws NullPointerException если переданный список равен null
     * @throws IndexOutOfBoundsException если countOfOperations превышает размер списка
     */
    public static long getTest(List<Integer> list, int countOfOperations) {
        long start = System.nanoTime();

        for (int i = 0; i < countOfOperations; i++) {
            list.get(i);
        }
        return System.nanoTime() - start;
    }

    /**
     * Измеряет время, затраченное на удаление элементов из начала списка.
     *
     * @param list список, над которым выполняются операции удаления
     * @param countOfOperations количество операций удаления
     * @return время в наносекундах, затраченное на все операции удаления
     * @throws NullPointerException если переданный список равен null
     * @throws IndexOutOfBoundsException если список пуст во время выполнения операций
     */
    public static long deleteTest(List<Integer> list, int countOfOperations) {
        long start = System.nanoTime();

        for (int i = 0; i < countOfOperations; i++) {
            list.remove(0);
        }
        return System.nanoTime() - start;
    }
}