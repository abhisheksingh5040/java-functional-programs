package com.technoelevate.functional.program.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Q: 1) Find all even numbers from a list
public class Q01 {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> approach01 = approach01(input);
        List<Integer> approach02 = approach02(input);
        System.out.println(approach01);
        System.out.println(approach02);
    }

    public static List<Integer> approach01(List<Integer> list) {
        return list.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
    }

    public static List<Integer> approach02(List<Integer> list) {
        return list.stream()
                .collect(Collectors.filtering(num -> num % 2 == 0, Collectors.toList()));
    }
}
