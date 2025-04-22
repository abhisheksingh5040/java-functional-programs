package com.technoelevate.functional.program.funcationalInterface;

import java.util.function.Function;

public class FunctionalExample {

    static Function<String, String> f1 = name -> name.toUpperCase();

    static Function<String,String> f2 = name -> name.concat("default");

    public static void main(String[] args) {
        String result = f1.andThen(f2).apply("java");
        System.out.println(result);

        String result1 = f1.compose(f2).apply("java");
        System.out.println(result1);
    }
}
