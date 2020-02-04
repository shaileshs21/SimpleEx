package com.simple.quals;

import java.util.ArrayList;
import java.util.Scanner;

class Merge {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[][] a = new int[n][n];
      for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
          a[i][j] = sc.nextInt();
      ArrayList<Integer> arr = GfG.mergeKArrays(a, n);
      printArray(arr, n * n);
    }
  }

  public static void printArray(ArrayList<Integer> arr, int size) {
    for (int i = 0; i < size; i++)
      System.out.print(arr.get(i) + " ");
    System.out.println();
  }
}// } Driver Code Ends
/* Complete the function below */

class GfG {
  public static ArrayList<Integer> mergeKArrays(int[][] arrays, int k) {
    // add code here.
    ArrayList<Integer> list = new ArrayList<>();
    int array[] = new int[k*k];
    HeapSort sort = new HeapSort();
    
    int m=0;
    for(int i = 0;i<k;i++){
      for(int j =0;j<k;j++){
        array[m] = arrays[i][j];
        m++;
      }
    }
    sort.heapSort(array, m);
   for(int i:array){
     list.add(i);
   }
    return list;
  }
}






















