package com.basics.java.fundamentals.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.google.common.collect.ImmutableList;

/*
 * List:
 * - Duplicates are allowed.
 * - Insertion Order must be preserved
 * - Child interface of collection interface
 * - ArrayList, LinkedList , Vector , Stack are the implementation classes for List
 * Index are very useful in detecting duplicates and also preserving insertion order
 * As list is child interface of collection, by default all the collection methods are applicable to list interface
 * List specific Methods:
 * - add(int index, Object o)
 * - addAll(int index, Collection c)
 * - remove(int index)
 * - indexOf(Object o) : return first occurrence
 * - lastIndexOf(Object o)
 * - getOf(int index): returns null if no object is present
 * - listIterator
 * - set(int index, Object o) 
 * 
 * ArrayList:
 * - Underlying data-structure is resizable array or growable arrays
 * - "null" insertion is possible
 * - default initial capacity is 10
 * - Once the arrayList reaches its max capacity , a new array list object is created with new capacity and all the existing data is copied into new arrayList and reference is pointed to the new arrayList object
 * - New Capacity = (Current Capacity *3/2) + 1
 * To transfer object from one place to another. object should be serializable
 * Implements RandomAccess interface. This helps in accessing any element with same speed
 * If the requirement is of retrieving the element frequently then arrayList is the best option as any random element can be accessed with the same speed
 * RandomAccess is a marker interface as it doesn't contain any method
 * Best choice for arrayList:
 * - If frequent operation is retrieval operation
 * Worst choice for arrayList:
 * - If frequent operation is add/delete in middle of list as it has various shift operations
 * No method in arrayList are non-synchronized
 * Multiple threads are allowed to operation arrayList object. Hence no thread safety
 * 
 * LinkedList:
 * - Best option when you need to perform addition and deletion in middle of list
 * - Internally it is doubly linked list
 * - Adding/Deleting element in the middle of linked list is easy
 * - Retrieving elements is costly as we have to iterate through the linkedList from start
 * - Heterogeneous elements are allowed
 * - "null" insertion is allowed
 * - Implements Cloneable and Serializable interfaces.RandomAccess interface is not implemented by linkedList hence the retrieval becomes costly
 * - LinkedList class can be used to develop stacks and queues
 * - Constructors:
 *   - LinkedList l = new LinkedList();
 *   - LinkedList 1 = new LinkedList(Collection c);
 *   
 * Vector:
 * - Underlying data-structure is resizable array or growable arrays
 * - "null" insertion is possible
 * - Implements Cloneable and Serializable interfaces
 * - Also implements RandomAccess interface
 * - capacity means total how many objects we can accomodate and size is how many objects are present
 * - Enumeration(elements) is used to fetch elements one by one
 * - Constructors:
 *   - Vector v = new Vector();
 *   - Ve
 * */
public class CollectionList {

    public static void main(String[] args) {
        //Constructors for arrayList
        ArrayList a1 = new ArrayList(); // Non synchronized.
        ArrayList a2 = new ArrayList(1000); //capacity
       // ArrayList<E> a3 = new ArrayList<E>(Collection c); This is meant to convert any collection c to arraylist
        a1.add("Gopal");
        //a1.add(null);
        a1.add(1);
        a1.add(1, "Heda");
        System.out.println(a1);
        List l1 = Collections.synchronizedList(a1); // Synchronized array list
        ImmutableList<String> list = ImmutableList.copyOf(a1);
        //list.add("Gopal"); // Unsupported Operation as list is immutable
        LinkedList l = new LinkedList<>();
        l.add(1);
        l.add("Gopal");
        l.set(0, "test");
        l.removeLast();
        System.out.println(l);
        
    }
}
