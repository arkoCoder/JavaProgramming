package com.basics.java.fundamentals.collections;

/*
 * Problems with Arrays:
 * - Arrays are fixed in size. Need to know the size prior to the implementation of arrays
 * - It can hold only homogeneous data elements. Can be solved by creating an array of objects
 * - Is not implemented based on standard data structures.So ready-made methods supported by underlying data structures cannot be expected by arrays.
 *   - Eg: Searching and sorting logic for arrays is the responsibility of the developer implementing arrays as implicit methods are not available for arrays
 * To overcome above problems we need to go for Collections framework.
 * Advantages of Collections:
 * - Growable in nature
 * - Can hold both homogeneous and heterogeneous objects
 * - Every collection class is based on some of the data structures
 * Collection concept is not performant. Reason for this is as it has growable nature , whenever list reaches it's max size, the whole list is copied to a newer and bigger list and the reference is updated to the new list. This is how it supports the growable nature. So this copying operation becomes heavy and hence collections are less performant
 * If the size is known, then it is good to use arrays instead of collections
 * Arrays can hold primitives and objects both but collections can only hold objects
 * Collection is a group of individual objects as a single entity.
 * Collection Framework defines classes and interfaces which can be used to represent group of objects into single entity
 * Key Interfaces of collection framework:
 * - Collection Interface: To represent group of objects into single entity. It defines the most common methods like add, remove , contains etc. There is no concrete class which directly implements collection interface directly 
 * */
public class CollectionsBasicIntroduction {

}
