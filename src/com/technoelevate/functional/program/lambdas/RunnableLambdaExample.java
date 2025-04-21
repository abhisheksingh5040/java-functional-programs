package com.technoelevate.functional.program.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println(Thread.currentThread() + "Inside runnable one!!");
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}
