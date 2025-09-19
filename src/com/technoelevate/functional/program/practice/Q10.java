package com.technoelevate.functional.program.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Q 10) Find the first element of a list
public class Q10 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("a", "b", "c");
        String approachO1 = approachO1(input);
        String approachO2 = approach02(input);
        System.out.println(approachO1);
        System.out.println(approachO2);
    }

    public static String approachO1(List<String> list) {
        return list.stream()
                .findFirst().orElse(null);
    }

    public static String approach02(List<String> input) {
        return input.stream()
                .limit(1)
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> list.isEmpty() ? null : list.get(0)));
    }
}
