package com.technoelevate.functional.program.practice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Q13 Count the frequency of each element in a list
public class Q13 {
    public static void main(String[] args) {
        List<String> items = List.of("a","b","a","c","b","a");
        Map<String, Long> approach01 = items.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Integer> approach02 = items.stream()
                .collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));

        System.out.println(approach01);
        System.out.println(approach02);
    }
}
