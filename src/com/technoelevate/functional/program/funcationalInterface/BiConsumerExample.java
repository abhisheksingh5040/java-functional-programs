package com.technoelevate.functional.program.funcationalInterface;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    static BiConsumer<Integer, Integer> add = (num1, num2) -> System.out.println("add: "+ (num1 + num2));
    static BiConsumer<Integer, Integer> sub = (num1, num2) -> System.out.println("sub: "+ (num1 - num2));
    static BiConsumer<Integer, Integer> mul = (num1, num2) -> System.out.println("mul: "+ (num1 * num2));
    static BiConsumer<Integer, Integer> div = (num1, num2) -> System.out.println("div: "+ (num1 / num2));

    public static void main(String[] args) {
        add.andThen(sub).andThen(mul).andThen(div).accept(4,2);
    }
}
