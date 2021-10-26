package com.basics.java.pattern.strategy;

public class StrategyImplementer {

    public static void main(String[] args) {
        Context cAdd = new Context(new OperationAdd());
        System.out.println(cAdd.executeOperation(5, 2));
        
        Context cSub = new Context(new OperationSubstract());
        System.out.println(cSub.executeOperation(5, 2));

    }

}
