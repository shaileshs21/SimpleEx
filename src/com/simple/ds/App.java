package com.simple.ds;

import java.util.ArrayList;

public class App {
  
  public static void main(String args[]){
    DataStructures structures = new DataStructures();
    //structures.LinkedList();
    //structures.DoublyLinkedList();
    //structures.CircularLinkedList();
  /*  structures.HashMap();
    System.out.println("");
    structures.realHashMap();*/
    
    //Contract between equlas() and hashcode() method
    //If we override equauls method then hashcode should be overridden
   /* DataStructures structures2 = structures;
    System.out.println(structures.hashCode() == structures2.hashCode());
    System.out.println(structures.equals(structures2));
    DataStructures  structures3 = new DataStructures();
    System.out.println(structures.hashCode() == structures3.hashCode());
    System.out.println(structures.equals(structures3));
    String abc = new String( "ABC");
    String xyz = new String( "ABC");
    System.out.println(abc.hashCode() == xyz.hashCode());
    System.out.println(abc.equals(xyz));  //This method is overridden otherwise it will compare just memory location
    System.out.println(abc == xyz);*/
    
  }
}
