package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class App {

    public static void main(String[] args) {
        int operations = 5000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        //array list test
        long timeAddArrayList = PerformanceTest.addTest(arrayList, operations);
        long timeGetArrayList = PerformanceTest.getTest(arrayList, operations);
        long timeDeleteArrayList = PerformanceTest.deleteTest(arrayList, operations);

        //linked list test
        long timeAddLinkedList = PerformanceTest.addTest(linkedList, operations);
        long timeGetLinkedList = PerformanceTest.getTest(linkedList, operations);
        long timeDeleteLinkedList = PerformanceTest.deleteTest(linkedList, operations);

        printTestResults(operations,
                timeAddArrayList, timeGetArrayList, timeDeleteArrayList,
                timeAddLinkedList, timeGetLinkedList, timeDeleteLinkedList);
    }

    public static void printTestResults(int operations, long timeAddArrayList, long timeGetArrayList, long timeDeleteArrayList,
                                        long timeAddLinkedList, long timeGetLinkedList, long timeDeleteLinkedList) {
        String header = String.format("%-20s %-15s %-15s %-15s", "Операции", "ArrayList", "LinkedList", "Разница");
        String addRow = String.format("%-20s %-15d %-15d %-15d",
                "Add (" + operations + ")", timeAddArrayList, timeAddLinkedList, timeAddArrayList - timeAddLinkedList);
        String getRow = String.format("%-20s %-15d %-15d %-15d",
                "Get (" + operations + ")", timeGetArrayList, timeGetLinkedList, timeGetArrayList - timeGetLinkedList);
        String deleteRow = String.format("%-20s %-15d %-15d %-15d",
                "Delete (" + operations + ")", timeDeleteArrayList, timeDeleteLinkedList, timeDeleteArrayList - timeDeleteLinkedList);

        String line = new String(new char[65]).replace('\0', '-');

        System.out.println("\nPerformance Test Results (time in nanoseconds)");
        System.out.println(line);
        System.out.println(header);
        System.out.println(line);
        System.out.println(addRow);
        System.out.println(getRow);
        System.out.println(deleteRow);
        System.out.println(line);

    }
}
