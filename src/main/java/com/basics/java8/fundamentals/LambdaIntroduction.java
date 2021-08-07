package com.basics.java8.fundamentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Collectors;

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
 * LISP is the first language using lambda
 * Main objective of lambda expression is to bring benefits of functional programming into java.
 * Lambda expressions are anonymous functions.
 * Anonymous functions are functions:
 * - without name
 * - without return type
 * - without modifiers 
 * "->" is the special symbol for expressing lambda expressions
 * Lambda expressions are always associated with FI
 * Lambda expressions are specific concept to functional interfaces
 * No separate .class files for lambda expressions. The lambda expressions are converted to private methods and get executed
 * compareTo is applicable to string objects for alphabetical order
 * Lambda expressions are not replacement for anonymous inner class
 * Anonymous inner class are the classes without names
 * Anonymous inner class are more powerful than lambda expressions as they can implment interfaces having multiple abstract methods
 * Anonymous inner class can extend normal and abstract classes
 * */
public class LambdaIntroduction {

    public static void main(String[] args) {
        
        //() -> System.out.println("Hello Lambda!!"); Basic lambda expression
        //(a, b) -> System.out.println("Sum is " + (a+b)); Compiler can implicitly guess the data type
        //n -> n*n; If curly braces are not used the no need to specify return statement but if curly braces are specified then we need to add return statement
        //s -> System.out.println(s.length());
        
        
        InterfaceImplementer iClass = new InterfaceImplementer();
        iClass.testDisplay("Woah");
        
        TestInterface ti = new InterfaceImplementer();
        ti.testDisplay("Interface implementation");
        
        TestInterface tiLambda = message -> System.out.println("Message received is " + message);
        tiLambda.testDisplay("Lambda implementation");
        tiLambda.add(1, 2);
        
        TestInterfaceAdd tiLambdaAdd = (a, b) -> a + b;
        int sum = tiLambdaAdd.testAdd(1, 2);
        System.out.println("Sum from the lambda is " + sum);
        
        MyRunnable myRunnable = new MyRunnable();
        Thread t = new Thread(myRunnable);
        t.start();
        
        
        Runnable runnable = () -> System.out.println("Child class using lambda expression");
        Thread t2 = new Thread(runnable);
        t2.start();
        
        
        ArrayList<Integer> testArray = new ArrayList<Integer>();
        testArray.add(20);
        testArray.add(21);
        testArray.add(10);
        testArray.add(0);
        
        System.out.println("Unsorted array is " + testArray);
        
        Collections.sort(testArray);
        
        System.out.println("Default Sorted array is " + testArray);
        
        Collections.sort(testArray, new MyComparator());
        
        System.out.println("Sorted Array is " + testArray);
        
        ArrayList<Integer> testArray01 = new ArrayList<Integer>();
        testArray01.add(20);
        testArray01.add(21);
        testArray01.add(10);
        Comparator<Integer> comparator = (o1,o2) -> (o1 < o2) ? -1 : (o1 > o2) ? 1 : 0;
        Collections.sort(testArray01, comparator);
        Iterator<Integer> i = testArray01.iterator();
        while (i.hasNext()) {
            int itest = (Integer)i.next();
            System.out.println("Iterator elements are "+ itest);
        }
        
        testArray01.stream().filter(e -> e%2==0).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Lambda sorted array " + testArray01);
        
        ArrayList<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee("Gopal", 3));
        empList.add(new Employee("Harsh", 4));
        empList.add(new Employee("Anil", 1));
        empList.add(new Employee("Indra", 2));
        
        System.out.println("Unsorted employee list " + empList);
        
        Collections.sort(empList, (e1,e2) -> (e1.employeeNumber < e2.employeeNumber) ? -1 : (e1.employeeNumber < e2.employeeNumber) ? 1:0);
        System.out.println("Sorted employee list by empNumber " + empList);
        
        Collections.sort(empList, (e1,e2) -> e1.name.compareTo(e2.name));
        System.out.println("Sorted employee list by name " + empList);
        
        //Anonymous inner class that implements Runnable interface
        Runnable r = new Runnable() {
            
            @Override
            public void run() {
                System.out.println("Anonymous inner class that implements runnable interface");
                
            }
        };
        
        Thread tAno = new Thread(r);
        tAno.start();
        // Anonymous inner class implementing interface with multiple abstract methods
        TestAnonymousClassInterface tAno1 = new TestAnonymousClassInterface() {
            
            @Override
            public void display(String message) {
                System.out.println("Message is " + message);
                
            }
            
            @Override
            public void add(int a, int b) {
               System.out.println("Sum is " + (a + b));
                
            }
        };
        
        tAno1.add(5, 6);
        tAno1.display("Anonymous inner class is powerful bitch");
        
   }   
}
interface TestInterface {
    void testDisplay(String message);
    default void add(int a, int b) {
        System.out.println("Sum is " + (a + b));
    };
}


interface TestInterfaceAdd {
    int testAdd(int a, int b);
}

interface TestAnonymousClassInterface {
   void display(String message);
   void add(int a, int b);
}

class InterfaceImplementer implements TestInterface {

    @Override
    public void testDisplay(String message) {
        System.out.println("Message received is " + message);
    }
    
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for(int i =0 ; i<10 ; i++) {
            System.out.println("Child Class");
        }
    }
}

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1 < o2) ? -1 : (o1 > o2) ? 1 : 0;
    }

}

class Employee {
    String name;
    int employeeNumber;
    
    public Employee(String name, int empNumber) {
        this.name = name;
        this.employeeNumber = empNumber;
    }

    @Override
    public String toString() {
        return "name= " + name + ": employeeNumber= " + employeeNumber;
    }
}