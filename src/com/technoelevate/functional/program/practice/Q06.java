package com.technoelevate.functional.program.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Q 6) Count the number of strings starting with a specific letter
public class Q06 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "apricot", "cherry");
        long approach01 = approach01(input);
        long approach02 = approach02(input);
        System.out.println(approach01);
        System.out.println(approach02);
    }

    public static long approach01(List<String> list) {
        return list.stream()
                .filter(str -> str.startsWith("a"))
                .collect(Collectors.counting());
    }

    public static long approach02(List<String> list) {
        return list.stream()
                .collect(Collectors.filtering(str -> str.startsWith("a"), Collectors.counting()));
    }
}
