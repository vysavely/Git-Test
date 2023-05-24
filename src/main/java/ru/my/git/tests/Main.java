package ru.my.git.tests;

import java.lang.reflect.Array;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Test");
        String[] gsom = new String[6];
        long [] gsom2 = new long[10];
        System.out.println(Arrays.toString(gsom));
        String strForArr1 = "Gsom2";
        gsom[3] = strForArr1;
        gsom[4] = gsom[3];
        String arr = "Test";

        System.out.println(arr);
        System.out.println(Arrays.toString(gsom));
        System.out.println(Array.get(gsom, 4));

        gsom2[1-1] = 5;
        System.out.println(Arrays.toString(gsom2));
        long arr3 = Arrays.stream(gsom2).sum();
        System.out.println(arr3);
        int gsom5;
        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
            gsom5 = i;
            System.out.println(gsom5);


        }





    }
}