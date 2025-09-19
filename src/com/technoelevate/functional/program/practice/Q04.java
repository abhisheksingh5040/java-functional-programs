package com.technoelevate.functional.program.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Q 4) Find the maximum number in a list
public class Q04 {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(3, 7, 2, 9, 5);
        long approach01 = approach01(input);
        long approach02 = approach02(input);
        System.out.println(approach01);
        System.out.println(approach02);
    }

    public static long approach01(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .max().orElseThrow();
    }

    public static long approach02(List<Integer> list) {
        return list.stream()
                .reduce(Integer::max).orElseThrow();
              //.reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
    }
}
