package com.basics.java.pattern.factory;

public class AndroidButtonImpl implements Button {
    private String operatingSystem;

    public void onClick() {
        System.out.println("This is android button onClick method with isAndriodButton value as " + operatingSystem);
    }

    public void populateData(String os) {
        operatingSystem = os;
    }
}
