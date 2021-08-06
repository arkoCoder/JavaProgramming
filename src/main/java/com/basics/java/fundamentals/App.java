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
        int[] fibonacciArray =  App.fibonacci(5);
       
        for (int i : fibonacciArray) {
            System.out.println(i);
        }
        
        for (int i=0; i < 5; i ++) {
            System.out.println("Recurssive hai re baba!! " + App.recurssiveFibonacci(i) + " ");
        }
        
        System.out.println("Is Isomorphic " + App.isIsomorphic("Chinun", "Darshan"));
    }
    
    static int[] fibonacci (int counter) {
        int firstNum = 0 ;
        int secondNum =1;
        int sum = 0;
        int[] fibonacciArray = new int[counter];
        for (int i= 0; i < counter;i++) {
            //System.out.println(firstNum);
            fibonacciArray[i] = firstNum;
            sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
        }

        return fibonacciArray;
    }
    
    static int recurssiveFibonacci(int sum) {
        if (sum <=1) {
            return sum;
        }
        
        return recurssiveFibonacci(sum-1) + recurssiveFibonacci(sum -2);
    }
    
    static boolean isIsomorphic(String s1, String s2) {
        Map<Character, Character> isomorphicMap = new HashMap<Character, Character>();
        for(int i=0;i< s1.length();i++) {
            Character s1Char = s1.charAt(i);
            Character s2Char = s2.charAt(i);
            
            if (isomorphicMap.containsKey(s1Char)) {
                if (isomorphicMap.get(s1Char)!= s2Char) {
                    return false;
                }
            } else {
                isomorphicMap.put(s1Char, s2Char);
            }
        }
        HashSet<Character> set = new HashSet<>(isomorphicMap.values());
        if (set.size() == isomorphicMap.values().size()) {
            return true;
        }
        return false;
    }
    
}
