package com.technoelevate.functional.program.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Q 2) Convert a list of strings to uppercase
public class Q02 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList( "abhishek","ajay");
        List<String> approach01 = approach01(input);
        List<String> approach02 = approach02(input);
        System.out.println(approach01);
        System.out.println(approach02);
    }

    public static List<String> approach01(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static List<String> approach02(List<String> list) {
        return list.stream()
                .collect(Collectors.mapping(String::toUpperCase,Collectors.toList()));
    }
}
