package ru.my.git.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MainTest {

    //long[] arr2 = {1, 2, 3, 4, 5, 6, 10, 12};

    @Test
    void test() {
        Main service = new Main();
        long[] arr2 = {1, 2, 3, 4, 5, 6, 10, 12};
        long expected = (Arrays.stream(arr2).sum())/ arr2.length;
        long actual = service.main(arr2);
        System.out.println(actual);

        Assertions.assertEquals(expected, actual);


    }

}
