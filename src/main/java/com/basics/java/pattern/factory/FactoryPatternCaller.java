package com.basics.java.pattern.factory;

public class FactoryPatternCaller {

    public static void main(String[] args) {
        ButtonFactory.getInstance("Windows").onClick();
        ButtonFactory.getInstance("Windows").populateData("Windows Enterprise");
        ButtonFactory.getInstance("Windows").onClick();
    }

}