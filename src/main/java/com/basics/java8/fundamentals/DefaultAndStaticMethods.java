package com.basics.java8.fundamentals;

/*
 * Every method in interface are public and abstract if modifier is not mentioned
 * Every variable present in interface is public static final
 * Default Methods:
 * - Also known as Defender Method , Virtual Extension Method
 * - This are the methods whose implementations are defined in the interface itself.
 * - Without implementation classes if we want to add new methods then we should go for default methods
 * - Default methods cannot be defined within the classes. Hence when overriding the method in the implemented class the method modifier should be changed to public
 * - Object class methods cannot be defined as default methods as they are by default available for every class eg: hashCode, equals
 * - If two interfaces contain same default methods, then the implementation must override the implementation of the default method
 * Static methods:
 * - As this methods are no where related to objects, it can be costly to define them in classes
 * - Interface static methods are available to implementation class by default
 * - Interface static methods should be called only by using interface name only
 * - Main method can be declared in the interface as it is static
 * - General utility methods can be defined under interfaces
 * */
public class DefaultAndStaticMethods implements TestStatic{

    public static void main(String[] args) {

        TestDefault defaultMethod = () -> System.out.println("Woah this is executed");
        defaultMethod.displayMessage();
        int sum = defaultMethod.sum(6, 6);
        System.out.println("Sum is " + sum);

        TestDefault defaultMethod1 = new MyClass();
        defaultMethod1.displayMessage();
        defaultMethod1.sum(2, 3);

        MyClass myClass = new MyClass();
        myClass.sum(2, 3);
        
        TestStatic.message();

    }
}

interface TestDefault {
    void displayMessage();

    default int sum(int a, int b) {
        System.out.println("In TestDefault");
        return a + b;
    };
}

interface TestDefault1 {
    void displayMessage();
    default int sum(int a, int b) {
        System.out.println("In TestDefault1");
        return a + b;
    };
}

interface TestStatic {
    static void message() {
       System.out.println("Message from static method");
    }
    
    static void main(String[] args) {
        System.out.println("Main method in static method");
    }
}

class MyClass implements TestDefault, TestDefault1{

    @Override
    public void displayMessage() {
       System.out.println("My own message");
    }

    @Override
    public int sum(int a, int b) {
        System.out.println("Overidden method ");
        //to call the implementation of TestDefault interface
        return TestDefault1.super.sum(a, b);
    }
}
