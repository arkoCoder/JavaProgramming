package com.basics.java.pattern.strategy;

public class Context {
    
    private Operation operation;

    public Context(Operation operation) {
        this.operation = operation;
    }
    
    public int executeOperation(int a, int b) {
        return operation.performOperation(a, b);
    }

}
