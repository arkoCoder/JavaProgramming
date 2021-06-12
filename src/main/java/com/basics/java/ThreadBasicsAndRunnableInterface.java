package com.basics.java;

/*
 * Thread can be defined by implementing Runnable interface directly
 * Runnable interface is present in java.lang package and contains only run method
 * */
public class ThreadBasicsAndRunnableInterface {
    public static void main(String[] args) {
        Executor t = new Executor();
        Thread thread = new Thread(t); // Here t is the target runnable
        thread.start();
        System.out.println("Main thread");

   }
}

class Executor implements Runnable {
    public void run() {
        System.out.println("Implementing runnable interface");
    }
}
