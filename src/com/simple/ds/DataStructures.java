package com.simple.ds;

public class DataStructures {
  void LinkedList() {
    LinkedList ls = new LinkedList();
    ls.insert(10);
    ls.insert(12);
    ls.insert(23);
    ls.insert(41);
    ls.insert(99);
    ls.insert(56);
    ls.printList();
    ls.delete(41);
    ls.printList();
    ls.delete(10);
    ls.printList();

  }

  void DoublyLinkedList() {
    DoublyLinkedList ls = new DoublyLinkedList();
    ls.insert(10);
    ls.insert(12);
    ls.insert(23);
    ls.insert(41);
    ls.insert(99);
    ls.insert(56);
    ls.printList();
    ls.printListReverse();
  }
  
  void CircularLinkedList(){
    CircularLinkedList ls = new CircularLinkedList();
    ls.insert(10);
    ls.insert(12);
    ls.insert(23);
    ls.insert(41);
    ls.insert(99);
    ls.insert(56);
    ls.printList();
  }
  
  void HashMap(){
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "ONE");
    map.put(2, "TWO");
    map.put(3, "ThRee");
    map.put(10, "TEN");
    map.put(20, "TWENTY");
    map.put(30, "THIRTY");
    map.put(40, "FORTY");
    //System.out.println(map.get(2));
    //System.out.println(map.get(30));
    map.printAll();
  }
  
  void realHashMap(){
    java.util.HashMap<Integer, String> map = new java.util.HashMap<>();
    map.put(1, "ONE");
    map.put(2, "TWO");
    map.put(3, "ThRee");
    map.put(10, "TEN");
    map.put(20, "TWENTY");
    map.put(30, "THIRTY");
    map.put(40, "FORTY");
    for(int key:map.keySet()){
      System.out.println(key + " " + map.get(key));
    }
  }
}
