package com.technoelevate.functional.program.practice;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//Q12 : Group a list of strings by their length
public class Q12 {
    public static void main(String[] args) {
        List<String> words = List.of("apple","banana","kiwi","pear");

        Map<Integer, List<String>> approach01 = words.stream().collect(Collectors.groupingBy(String::length));
        Map<Integer, Set<String>> approach02 = words.stream()
                .collect(Collectors.groupingBy(String::length,Collectors.toSet()));
        System.out.println(approach01);
        System.out.println(approach02);
    }
}
