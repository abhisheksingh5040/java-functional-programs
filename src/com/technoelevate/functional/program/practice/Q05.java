package com.technoelevate.functional.program.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Q 5) Find the minimum number in a list
public class Q05 {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(3, 7, 2, 9, 5);
        long approach01 = approach01(input);
        long approach02 = approach02(input);
        System.out.println(approach01);
        System.out.println(approach02);
    }

    public static long approach01(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).min().orElseThrow();
    }

    public static long approach02(List<Integer> list) {
        return list.stream()
//                .reduce(Integer::min).orElseThrow();
                .min(Comparator.naturalOrder()).orElseThrow();
    }
}
