package com.simple.ds;

public class LinkedList {
  Node head;
  Node tail;

  LinkedList() {
    head = null;
    tail = null;
  }

  void insert(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      tail = newNode;
      tail.next = null;
    } else {
      tail.next = newNode;
      newNode.next = null;
      tail = newNode;
    }
  }

  void delete(int value){
    Node curr =  this.head;
    Node prev = this.head;
    
    while(curr != null){
      if(curr.data == value){
        if(curr == this.head){
          head = curr.next;
          curr = null;
          break;
        }
        
        prev.next = curr.next;
        if(prev.next == null){
          tail = prev;
        }
        curr =null;
        break;
      }
      prev = curr;
      curr = curr.next;
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

  public class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

}
