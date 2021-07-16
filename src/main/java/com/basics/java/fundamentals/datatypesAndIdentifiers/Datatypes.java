package com.basics.java.fundamentals.datatypesAndIdentifiers;

/*
 * In Java, every variable/expression should have some type.
 * Each type is strictly defined. Hence java is strict type based language.
 * Java is not pure object oriented programming language. We are dependent primitive data types and most of the oops features are not supported(Operator overloading, multiple inheritance etc)
 * Primitive DataTypes (8): 
 * - numeric datatypes: Used to represent numbers.
 *   - Integral: byte, short, int, long
 *   - Floating point: float, double
 * - non numeric datatypes:
 * 	  - char , boolean
 * Except boolean and char remaining are signed data types.
 * Positive numbers are always represented in the memory
 * Negative numbers are always represented in 2's complement form
 * Java is unicode based language i.e. 256 ASCII characters + Any language characters
 * null is the default value for object
 * byte: 
 * 	- size: 8 bits
 *  - MSB: Most Significant Bit is the signed bit. 0 is for +ve and 1 is for -ve 
 *  - max value: +127
 *  - min value: -128 (As 2^7 is 128)
 *  - Best choice to use byte is:
 *    - when handling data in terms of streams 
 *    - when need to send data over a network
 *    - Because file supported and network supported form is byte
 *  - Default value: 0
 *  - Wrapper class:Byte
 * short:
 * 	- size: 16 bits i.e. 2 bytes
 *  - MSB: Most Significant Bit is the signed bit. 0 is for +ve and 1 is for -ve 
 *  - max value: 2^15 -1
 *  - min value: -(2^15)  
 *  - Best suitable for 16 bit processors
 *  - Default value: 0
 *  - Wrapper class: Short
 * int:
 * 	- size: 32 bits i.e. 4 bytes
 *  - MSB: Most Significant Bit is the signed bit. 0 is for +ve and 1 is for -ve 
 *  - max value: 2^31 -1
 *  - min value: -(2^31)
 *  - Default type for integral numbers
 *  - Default value: 0
 *  - Wrapper class: Integer
 * long:
 * 	- size: 64 bits i.e. 8 bytes
 *  - MSB: Most Significant Bit is the signed bit. 0 is for +ve and 1 is for -ve 
 *  - max value: 2^63 -1
 *  - min value: -(2^63)
 *  - eg: return type of length method of filestream is a long
 *  - Default value: 0
 *  - Wrapper class:Long
 * float:
 *  - 5-6 places of accuracy
 *  - single precision
 * 	- size: 32 bits i.e. 4 bytes
 *  - MSB: Most Significant Bit is the signed bit. 0 is for +ve and 1 is for -ve 
 *  - max value: 3.4e38 i.e 3.4*(10^38)
 *  - min value: -3.4e38
 *  - Default value: 0.0
 *  - Wrapper class: Float
 * double:
 *  - 14 or more places of accuracy
 *  - double precision
 * 	- size: 64 bits i.e. 8 bytes
 *  - MSB: Most Significant Bit is the signed bit. 0 is for +ve and 1 is for -ve 
 *  - max value: 1.7e308 i.e 1.7*(10^308)
 *  - min value: -1.7e308
 *  - Default value: 0.0
 *  - Wrapper class:Double
 * boolean:
 * 	- size: Not applicable (Depends on the VM)
 *  - allowed values: true/false
 *  - Default value: false
 *  - Wrapper class:Boolean
 * char:
 *  - size: 16 bits i.e 2 bytes (Java is unicode based)
 *  - min : 0
 *  - max: 65535
 *  - Default value: 0 (represents space character)
 *  - Wrapper class:Character
 * */
public class Datatypes {

	public static void main(String[] args) {
		//Common examples
		//byte a = 128; // Type mismatch error. Possible loss of precision
		//byte a = 10.5 // Type mismatch error. Possible loss of precision
		//byte a = true; // Type mismatch error. Type mismatch. Incompatible types
		//boolean b = 0;// Type mismatch error. Type mismatch. Incompatible types
		//boolean b= True;// Type mismatch error. Type mismatch. Cannot find symbol variable
		/*
		 * if (0) {
		 *  System.out.println("Incompatible types");
		 * }
		 */
		
		/*
		 * while (1) { System.out.println("Compile time error. Incompatible types"); }
		 */
		char a = 'a';
		System.out.println("a");

	}

}
