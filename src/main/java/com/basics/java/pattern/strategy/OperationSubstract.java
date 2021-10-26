package com.basics.java.pattern.strategy;

public class OperationSubstract implements Operation{

    @Override
    public int performOperation(int a, int b) {
        return (a - b);
    }

}
