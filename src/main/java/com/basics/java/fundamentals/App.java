package com.basics.java.fundamentals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        System.out.println("Map basic test");
        Map<String,HashSet<String>> map = new HashMap<String, HashSet<String>>();
        
        HashSet<String> testHashSet = new HashSet<String>();
        HashSet<String> testHashSet01 = new HashSet<String>();
        HashSet<String> testHashSet02 = new HashSet<String>();
        testHashSet.add("Gopal");
        testHashSet.add("Heda");
        
        testHashSet01.add("Gopal01");
        testHashSet01.add("Heda01");
        
        testHashSet02.add("Gopal02");
        
        map.put("Gopal", testHashSet);
 
        /*
         * if(map.containsKey("Gopal")){ map.get("Gopal").addAll(testHashSet01); } else
         * { HashSet<String> list = new HashSet<String>(); list.add("Harsh");
         * map.put("Harsh", list); }
         */
        System.out.println("Gopal Value is " + map.get("Gopal"));
        map.computeIfAbsent("Gopal", k ->testHashSet02).addAll(testHashSet01);
        
        System.out.println("Gopal Value is " + map.get("Gopal"));
        
        System.out.println("Gopal Value is " + map.get("Kunal"));
        
        
        
        Overiding o = new Overiding();
        o.sayHello("Gopal");
        
        Overiding o1 = new OverridingChild();
        o1.sayHello("Harsh");
        
        OverridingChild o2 = new OverridingChild();
        o2.sayHello("Anil");
        
        /*
         * OverridingChild o3 = new Overiding(); o3.sayHello("Indra");
         */
        
    }
}
