package com.simple.mix;

import java.util.*;

class gfg {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T > 0) {
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      int key = sc.nextInt();

      System.out.println(bin_search(arr, 0, n - 1, key));
      T--;
    }

  }

  static int bin_search(int A[], int left, int right, int k) {
    int mid;
    while (left < right) {
      mid = (left + right+1) / 2;
      if (A[mid] == k) {
        return mid;
      }
      if (k > A[mid]) {

        left = mid;
      }
      if (k < A[mid]) {
        right = mid;
      }

    }
    return -1;

  }
}
