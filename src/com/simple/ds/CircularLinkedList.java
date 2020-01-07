package com.simple.ds;

public class CircularLinkedList {
  Node last;

  CircularLinkedList() {
    last = null;
  }

  void insert(int data) {
    Node newNode = new Node(data);
    if (last == null) {
      last = newNode;
      newNode.next = last;
    } else {
      Node head = getHead();
      last.next = newNode;
      newNode.next = head;
      last = newNode;
    }
  }

  Node getHead() {
    return this.last.next;
  }

  void delete(int value) {

  }

  void printList() {

    Node node = getHead();

    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
      if (node == getHead()) {
        break;
      }
    }
    // System.out.println("");
  }

  public class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

}
