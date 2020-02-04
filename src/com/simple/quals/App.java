package com.simple.quals;

public class App {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    //int arr[] = new int[]{121, 10, 130, 57, 36, 17};
    int arr[] = new int[]{1, 2, 3, 4, 0, 5, 10, 15, 2, 4, 8, 10, 3, 9, 27, 81};
    HeapSort sort = new HeapSort();
    sort.heapSort(arr, arr.length);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

}
