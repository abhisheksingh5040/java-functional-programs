package com.technoelevate.functional.program.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Q 11) Join a list of strings into a single comma-separated string
public class Q11 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("a","b","c");
        String output = input.stream()
                .collect(Collectors.joining(", "));
        System.out.println(output);
    }
}
