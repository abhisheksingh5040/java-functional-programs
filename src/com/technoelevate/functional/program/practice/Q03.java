package com.technoelevate.functional.program.practice;

import java.util.Arrays;
import java.util.List;

//Q 03) Find the sum of all numbers in a list
public class Q03 {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        long approach01 = approach01(input);
        long approach02 = approach02(input);
        System.out.println(approach01);
        System.out.println(approach02);
    }

    public static long approach01(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static long approach02(List<Integer> list) {
        return list.stream()
                .reduce(0, (a, b) -> a + b);
    }

}
