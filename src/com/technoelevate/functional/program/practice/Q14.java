package com.technoelevate.functional.program.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Q14: Find the longest string in a list
public class Q14 {
    public static void main(String[] args) {
        List<String> words = List.of("apple","banana","kiwi","pear");
        String approach01 = words.stream()
                .max(Comparator.comparingInt(String::length)).orElseThrow();
        String approach02 = words.stream()
                .reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2).orElse("");
        System.out.println(approach01);
        System.out.println(approach02);
    }
}
