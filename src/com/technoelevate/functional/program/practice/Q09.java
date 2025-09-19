package com.technoelevate.functional.program.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Q 9) Sort a list in descending order
public class Q09 {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(4, 1, 3, 2);
        List<Integer> sort = sort(input);
        System.out.println(sort);
    }

    public static List<Integer> sort(List<Integer> list) {
        return list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
