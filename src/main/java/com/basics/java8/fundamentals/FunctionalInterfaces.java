package com.basics.java8.fundamentals;

/*
 * Functional Interfaces are the interfaces having single abstract methods
 * Functional interfaces are used to invoke lambda expressions
 * Functional interfaces can have any number of default and static methods but should have only one abstract method
 * FI wrt inheritance:
 * - 
 * */
public class FunctionalInterfaces {
    
    public static void main(String[] args) {
    }

    @FunctionalInterface
    public interface TestInterface {
        void test();
        default void testDefault() {
          System.out.println("Hello FI");  
        };
        //void test2(); This will throw an error as we should only have on abstract method
    }
    
    @FunctionalInterface
    public interface TestInterface1 extends TestInterface {
        //void test1(); //will give error as parent interface already has one abstract method
        void test(); // Overriding parent interface method hence it is valid
    }
    
    public interface TestInterface2 extends TestInterface {
        void test2(); // valid as TestInterface2 is normal interface
    }
}
