package com.technoelevate.functional.program.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (o1, o2) ->o1.compareTo(o2);
        System.out.println(comparator.compare(3,3));//0
        System.out.println(comparator.compare(3,2));//+1
        System.out.println(comparator.compare(2,3));//-1
    }
}
