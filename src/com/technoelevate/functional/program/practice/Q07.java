package com.technoelevate.functional.program.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Q 7) Remove duplicate elements from a list
public class Q07 {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 2, 3, 3, 3, 4);
        List<Integer> approach = approach(input);
        System.out.println(approach);
    }

    public static List<Integer> approach(List<Integer> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
