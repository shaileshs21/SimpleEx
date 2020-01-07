package com.simple.quals;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import com.simple.collection.Collection;

public class Sorting {

  // Sorting set by using comparator
  public void sortOps5() {
    Person p1 = new Person("Harry", "PUNE", 6);
    Person p2 = new Person("Ron", "PUNE", 2);
    Person p3 = new Person("John", "BANER", 3);
    Person p4 = new Person("JAXB", "BANER", 1);
    Person p5 = new Person("JOHN", "DELHI", 5);
    Person p6 = new Person("Ketty", "US", 4);

    Set<Person> set = new HashSet<>();
    Collections.addAll(set, p1, p2, p3, p4, p5, p6, p1);
    // Collections.sort(set);
    //************** So collection.sort is only available for LIST  *****************
    
    //converting Set to list
    List<Person> setToList = new ArrayList<Person>(set);
    EmpIDComparator idComparator = new EmpIDComparator();
    
    //There is no direct support for sorting the sets in Java. To sort a set, follow these steps:
    //1.Convert set to list.
    //2.Sort list using Collections.sort() API.
    //3.Convert list back to set.
    //https://howtodoinjava.com/java-sorting-guide/


    Collections.sort(setToList,idComparator);
    Set<Person> listToSet = new LinkedHashSet<>(setToList);
    System.out.println("Sorted Set by Converting it into list:");
    for (Person person : listToSet) {
      System.out.println(person.toString());
    }
  }

  // Sorting List by using comparator
  public void sortOps4() {
    Person p1 = new Person("Harry", "PUNE", 6);
    Person p2 = new Person("Ron", "PUNE", 2);
    Person p3 = new Person("John", "BANER", 3);
    Person p4 = new Person("JAXB", "BANER", 1);
    Person p5 = new Person("JOHN", "DELHI", 5);
    Person p6 = new Person("Ketty", "US", 4);

    List<Person> empList = new ArrayList<>();
    Collections.addAll(empList, p1, p2, p3, p4, p5, p6, p1);

    EmpIDComparator idComparator = new EmpIDComparator();
    Collections.sort(empList, idComparator);
    System.out.println("Sorted List by id:");
    for (Person person : empList) {
      System.out.println(person.toString());
    }
    System.out.println("");

    NameComparator nameComparator = new NameComparator();
    Collections.sort(empList, nameComparator);
    System.out.println("Sorted List by name:");
    for (Person person : empList) {
      System.out.println(person.toString());
    }
  }

  // Sorting Objects
  public void sortOps3() {
    Person p1 = new Person("Harry", "PUNE", 1);
    Person p2 = new Person("Ron", "PUNE", 2);
    Person p3 = new Person("John", "BANER", 3);
    Person p4 = new Person("RAM", "BANER", 4);
    Person p5 = new Person("JOHN", "DELHI", 5);
    Person p6 = new Person("Ketty", "US", 6);

    List<Person> empList = new ArrayList<>();
    Collections.addAll(empList, p1, p2, p3, p4, p5, p6, p1);
    System.out.println("List:");
    for (Person person : empList) {
      System.out.println(person.toString());
    }
    System.out.println("");
    Set<Person> set = new HashSet<>();
    Collections.addAll(set, p1, p2, p3, p4, p5, p6, p1);
    System.out.println("HashSet:");
    for (Person person : set) {
      System.out.println(person.toString());
    }
    System.out.println("");
    System.out.println("Linked Hashset:Maintains order");
    Set<Person> set2 = new LinkedHashSet<>();
    Collections.addAll(set2, p1, p2, p4, p3, p5, p6, p1);
    for (Person person : set2) {
      System.out.println(person.toString());
    }

    // Collections.sort(empList);
    // Sorting is NA for list<Person> i.e. custom objects. It is only available for primitives or Wrapper classes
    // Lets implement comparator interface in next sortOps4();

  }

  // Collections :Arraylist Collections.sort
  public void sortOps2() {

    // Sorting Integer
    List<Integer> list = new ArrayList<>();
    Collections.addAll(list, 23, 45, 11, 23, 89, 56, 74, 61, 24, 9, 34, 46, 20);
    for (Integer integer : list) {
      System.out.print(integer + " ");
    }
    System.out.println("");
    Collections.sort(list, Collections.reverseOrder());
    for (Integer integer : list) {
      System.out.print(integer + " ");
    }
    System.out.println("");

    // String with Set
    Set<String> set = new HashSet<>();
    Collections.addAll(set, "abc", "klm", "ktm", "honda", "gixxer", "play", "ns160", "Activa", "abc", "abc", "ktm");
    for (String string : set) {
      System.out.print(string + " ");
    }
    System.out.println("");
    // Collections.sort(set); //not avaialble

    Queue<Integer> q = new LinkedList<>();
    q.add(10);
    q.add(20);
    q.add(15);
    q.add(50);
    // q.remove();

    for (Iterator iterator = q.iterator(); iterator.hasNext();) {
      System.out.println(iterator.next());
    }
    System.out.println("");
    Collections.sort((LinkedList) q); // Queue is passed by type casting
    for (Iterator iterator = q.iterator(); iterator.hasNext();) {
      System.out.println(iterator.next());
    }

  }

  public void sortOps() {
    // Primitive types sorting:int
    int arr[] = {23, 45, 11, 23, 89, 56, 74, 61, 24, 9, 34, 46, 20};
    System.out.println(arr);
    System.out.println(Arrays.toString(arr));
    Arrays.sort(arr);
    System.out.println(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println("");

    // Primitive types sorting:String
    String strArr[] = {"abc", "klm", "ktm", "honda", "gixxer", "play", "ns160", "Activa"};
    System.out.println(strArr);
    System.out.println(Arrays.toString(strArr));
    Arrays.sort(strArr);
    System.out.println(strArr);
    System.out.println(Arrays.toString(strArr));
    System.out.println("");

    // Wrapper types sorting:Integer
    Integer intArr[] = {34, 23, 65, 12, 56, 4, 76, 44, 27, 90};
    System.out.println(intArr);
    System.out.println(Arrays.toString(intArr));
    Arrays.sort(intArr);
    System.out.println(Arrays.toString(intArr));
    Arrays.sort(intArr, Collections.reverseOrder()); // Reverse Order
    System.out.println(Arrays.toString(intArr));
  }
}
