package com.simple.mix;



public class LinkedList {
  Node head;
  Node tail;

  LinkedList() {
    head = null;
    tail = null;
  }

  public void add(int element) {
    Node newNode = new Node();
    newNode.value = element;
    if (head == null) {
      head = newNode;
      tail = newNode;
    }
    else{
      tail.next = newNode;
      tail = newNode;
    }
  }

  public class Node {
    int value;
    Node next;
  }
}
