package ru.my.git.tests;

import java.util.Arrays;

public class Main {
    public long main(long[] income) {
        System.out.println("Test");
        long[] arr = {1, 2, 3, 4, 5, 6, 10, 12};
        System.out.println(Arrays.toString(arr));
        //System.out.println(arr[2]);
        long average = (Arrays.stream(arr).sum()) / arr.length;
        System.out.println("Среднее значение в массиве: " + average);
        for (long test : arr) {
            if (test < average) {
                test = test;
                System.out.println("Основные: " + test);
            } else {
                System.out.println("Прочее: " + test);
            }
        }
        return average;
    }
}