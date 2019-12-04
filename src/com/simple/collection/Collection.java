package com.simple.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.SortedSet;
import java.util.Vector;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collection {

  public void ArrayList(){
    ArrayList<String> list=new ArrayList<String>();
    list.add("Ravi");  
    list.add("Vijay");  
    list.add("Ravi");  
    list.add("Ajay");
    
    System.out.println(list.get(0));
  }
  
  public void LinkedList(){
    LinkedList<String> al=new LinkedList<String>();
    al.add("Ravi");  
    al.add("Vijay");  
    al.add("Ravi");  
    al.add("Ajay");
    
    System.out.println(al.get(3));
  }
  
  public void Vector(){
    Vector<String> v=new Vector<String>();
    v.add("Ayush");  
    v.add("Amit");  
    v.add("Vijay");  
    v.add("Garima");
    System.out.println(v.get(2));
  }
  
  public void Stack(){
    Stack<String> stack = new Stack<String>();  
    stack.push("Ayush");  
    stack.push("Garvit");  
    stack.push("Amit");  
    stack.push("Vijay");  
    stack.push("Garima");  
    stack.pop();  
    Iterator<String> itr=stack.iterator();  
    while(itr.hasNext()){  
    System.out.println(itr.next());  
    }  
    
    System.out.println(stack.get(3));
  }
  
/*  HashSet is unordered and unsorted Set.
  LinkedHashSet is the ordered version of HashSet.

  The only difference between HashSet and LinkedHashSet is that:
  LinkedHashSet maintains the insertion order.

  When we iterate through a HashSet, the order is unpredictable while it is predictable in case of LinkedHashSet.

  The reason for how LinkedHashSet maintains insertion order is that:
  The underlying used data structure is Doubly-Linked-List.*/
  
  public void hashSet(){
    HashSet<String> set=new HashSet<String>();  
    set.add("Ravi");  
    set.add("Vijay");  
    set.add("Ravi");  
    set.add("Ajay");  
    set.add("Ayush");  
    set.add("Amit");  
    set.add("Vijay");  
    set.add("Garima");
    
    //System.out.println(set.);  //No indexing available
    
    Iterator<String> itr=set.iterator();  
    while(itr.hasNext()){  
    System.out.println(itr.next());  
    }  
  }
  
  
  public void LinkedhashSet(){
    LinkedHashSet<String> set= new LinkedHashSet<String>();  
    set.add("Ravi");  
    set.add("Vijay");  
    set.add("Ravi");  
    set.add("Ajay");  
    set.add("Ayush");  
    set.add("Amit");  
    set.add("Vijay");  
    set.add("Garima");  
    
    //System.out.println(set.);//No indexing available
    
    Iterator<String> itr=set.iterator();  
    while(itr.hasNext()){  
    System.out.println(itr.next());  
    }  
  }
  
  public void TreeSet(){
    SortedSet<String> set = new java.util.TreeSet<>();  
    set.add("Ravi");  
    set.add("Vijay");  
    set.add("Ravi");  
    set.add("Ajay");  
    set.add("Ayush");  
    set.add("Amit");  
    set.add("Vijay");  
    set.add("Garima");
    
    //System.out.println(//set.);   //No indexing available
    
    Iterator<String> itr = set.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
  }
  
  
  public void hashMap(){
    Map<Integer, String> map = new HashMap<Integer, String>();
    map.put(100, "Amit");
    map.put(101,"Vijay");  
    map.put(102,"Rahul");  
    map.put(110,"Ravi");
    map.put(190,"Vijay");
    map.put(201,"Ajay");
    map.put(76,"Ayush");
    map.put(10,"Garima");
    //Not in order
    for(Map.Entry m :map.entrySet()){
      System.out.println(m.getKey() + " " + m.getValue());
    }
  }
  
  public void linkedHashMap(){
    Map<Integer, String> map = new LinkedHashMap<Integer, String>();
    map.put(100, "Amit");
    map.put(101,"Vijay");  
    map.put(102,"Rahul");  
    map.put(110,"Ravi");
    map.put(190,"Vijay");
    map.put(201,"Ajay");
    map.put(76,"Ayush");
    map.put(10,"Garima");
    //Not in order
    for(Map.Entry m :map.entrySet()){
      System.out.println(m.getKey() + " " + m.getValue());
    }
  }
  
  
  public void treeMap(){
    Map<Integer, String> map = new TreeMap<Integer, String>();
    map.put(100, "Amit");
    map.put(101,"Vijay");  
    map.put(102,"Rahul");  
    map.put(110,"Ravi");
    map.put(190,"Vijay");
    map.put(201,"Ajay");
    map.put(76,"Ayush");
    map.put(10,"Garima");
    //Not in order
    for(Map.Entry m :map.entrySet()){
      System.out.println(m.getKey() + " " + m.getValue());
    }
  }
 
}
