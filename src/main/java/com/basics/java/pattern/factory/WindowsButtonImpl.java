package com.basics.java.pattern.factory;

public class WindowsButtonImpl implements Button {
    
    private String operatingSystem;

    public void onClick() {
        System.out.println("This is windows button onClick method with isWindowsButton value as " + operatingSystem);
    }

    public void populateData(String os) {
        operatingSystem = os;
    }

}
