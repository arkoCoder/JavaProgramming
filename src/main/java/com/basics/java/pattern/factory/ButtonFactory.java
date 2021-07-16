package com.basics.java.pattern.factory;

import java.util.HashMap;
import java.util.Map;

public class ButtonFactory {
    
    static Map<String, Button> buttonToImplMap = new HashMap<String, Button>();
    
    static {
        buttonToImplMap.put("Windows", new WindowsButtonImpl());
        buttonToImplMap.put("Android", new AndroidButtonImpl());
    }
    
    public static Button getInstance(String buttonType) {
        return buttonToImplMap.get(buttonType);   
    }
}
