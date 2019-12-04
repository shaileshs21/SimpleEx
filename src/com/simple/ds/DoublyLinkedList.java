package com.simple.ds;

public class DoublyLinkedList {
  Node head;
  Node tail;

  public DoublyLinkedList() {
    head = null;
    tail = null;
  }

  void insert(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
  }

  void printList() {
    Node node = this.head;
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
    System.out.println("");
  }
  
  void printListReverse(){
    Node node = this.tail;
    while(node != null){
      System.out.print(node.data + " ");
      node = node.prev;
    }
    System.out.println("");
  }

  public class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

}
