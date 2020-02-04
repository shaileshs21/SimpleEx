package com.simple.gfg;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOperations {

  public static void main(String[] args) {
    Queue<Integer> q = new PriorityQueue<Integer> ();
    q.add(5);
    q.add(2);
    q.add(1);
    q.add(4);
    q.add(3);
    System.out.println(q);
    System.out.println( q.peek() );
    System.out.println(q);
  }
}
