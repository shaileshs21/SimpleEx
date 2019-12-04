package com.simple.collection;


public class App {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Collection collection = new Collection();
    //collection.ArrayList();
    //collection.LinkedList();
    //collection.Vector();
    //collection.Stack();
    //collection.hashSet();
    //collection.LinkedhashSet();
    //System.out.println("--------------Sorted Set --------------------------");
    //collection.TreeSet();
    collection.hashMap();
    System.out.println("--------------Ordered Map --------------------------");
    collection.linkedHashMap();
    System.out.println("--------------Sorted Map --------------------------");
    collection.treeMap();
  }

}
