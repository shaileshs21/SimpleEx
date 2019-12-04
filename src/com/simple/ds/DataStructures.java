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
}
