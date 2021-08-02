package com.basics.java.lambdas;

import java.util.function.Predicate;

/*
 * Java is not a functional programming language
 * With Java8, functional interfaces are introduced
 * Functional interface are the interfaces having one abstract function
 * It represents abstract concepts like functions , actions or predicates
 * Predicates: methods that take one value as input and returns a boolean
 * Consumer: accepts a single argument with no return type
 * Function: accepts one argument and produces a result
 * Supplier: represent a supplier of results
 * UnaryOperator: single argument with one return value
 * BinaryOperator: takes two argument and return one
 * 
 * */
public class LambdaIntroduction {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Predicate<String> stringLen = (s) -> s.length() < 10;
        System.out.println(stringLen.test("GopalAnilHeda"));
        
        GreetingFunction greetingMessage = (message) -> System.out.println("Hello " + message);
        greetingMessage.sayMessage("Gopal");

    }

}

@FunctionalInterface
interface GreetingFunction {
    void sayMessage(String message);
}
