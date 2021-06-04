package com.basics.java;
/*
 * - Identifiers are names in java
 * - Identifiers can only have below characters:
 *   - a-z, A-Z, 0-9, $ , _
 * - Identifiers should always start with alphabets
 * - Identifiers are case-sensitive
 * - No length limit for java identifiers
 * - Reserved words cannot be used as identifiers
 * - Predefined java class names and interface names can be used as identifiers. e.g. String and Runnable classes can be used as identifiers
 * - Java has only 53 reserved words
 * - Reserved words represent some meaning or functionality
 * - Reserved Words:
 * 	 - Keywords (50): 48 (used keywords) , 2 (unused Keywords): goto , const
 *   - Literals (3) : true , false ,null
 * - Keywords are associated with functionality
 * - Literals just represent values
 * - Keywords:
 *    - datatype: byte, short, int, long, float, double, boolean, char
 *    - flow control: if, else, switch, case ,default, while, do, for, break, continue, return 
 *    - modifiers: public, private, protected, static, final, abstract, synchronized, native, strictfp, transient, volatile
 *    - exception handling: try, catch, throws, finally, throw, assert
 *    - class related: class, interface, extends, implements, package, import
 *    - object related: new, instanceof, super, this
 *    - void return type: void (Java: return type is mandatory)
 *    - enum (1.5 version): Use enum to define group of named constants
 * - Literals:
 * 	  - true , false: value for boolean datatype
 * 	  - null: default value for object reference
 * - Reserved Words only contain lower case alphabets.
 * - No delete keyword is present as destruction of useless objects is responsibility of garbage collector
 * */

public class IdentifiersAndReservedWords {

    public static void main(String[] args) {
    	System.out.println("Identifiers and Reserved words");
    	int i_$ = 1; // Valid Identifier
    	//int i# = 0; // Invalid identifier as # is not allowed.Will give compile time error as Invalid Character
    	//int 12a = 2; // Invalid identifier as identifier should always start with alphabets .Will give compile time error as Invalid Character
        //int new = 2; // Invalid identifier as reserved words cannot be used as identifiers .Will give compile time error as invalid VariableDeclaratorId
    	int Integer = 1; // Valid as predefined java class and interface names can be used as identifiers
    
    
    }

}
