package com.basics.java8.fundamentals;

import java.util.function.Function;
import java.util.function.Predicate;

/*
 * Founded in 2014. Focussed on consized code by enabling functional programming
 * Features:
 * - Lambda Expressions: To enable functional programming in java. A function can be handled as an object
 * - Functional Interfaces
 * - Default and static methods
 * - Predefined Functional Interfaces: Predicates, Function, Consumers, Suppliers
 * - Double colon operator(::): Method Reference, Constructor References
 * - Streams
 * - Date and Time api
 * - Optional class
 * - Nashorn Javascript Engine
 * */
public class Java8Basics {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Function<Integer, Integer> f = i -> i*i;
        Predicate<Integer> p = i -> i%2==0;
        System.out.println(f.apply(5));
        System.out.println(p.test(5));
    }

}
