package com.technoelevate.functional.program.funcationalInterface;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p1 = num -> num % 2 == 0;
    static Predicate<Integer> p2 = num -> num % 5 == 0;

    public static void predicateAnd() {
        System.out.println("Predicate and : " + p1.and(p2).test(10));//true
        System.out.println("Predicate and : " + p1.and(p2).test(8)); //false
    }

    public static void predicateOr() {
        System.out.println("Predicate or : " + p1.or(p2).test(10));//true
        System.out.println("Predicate or : " + p1.or(p2).test(8));//true
    }

    //it is treated as (!)
    public static void predicateNegate() {
        System.out.println("Predicate negate : " + p1.or(p2).negate().test(10));//false
        System.out.println("Predicate negate : " + p1.or(p2).negate().test(8));//false
    }

    public static void main(String[] args) {
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
