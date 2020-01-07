package com.simple.sorting;

public class Sorting {

  // Quick sort

  public void quickSort(int[] arr, int start, int end) {
    if (start < end) {
      int q;
      q = partition(arr, start, end);
      quickSort(arr, start, q-1);
      quickSort(arr, q+1, end);
    }
  }

  // 50, 23, 9, 18, 61, 32
  // 23, 50, 9, 18, 61, 32
  // 23, 9, 50, 18, 61, 32
  // 23, 9, 18, 50, 61, 32
  // 23, 9, 18, 32, 61, 50
  private int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low;
    for (int j = low; j < high; j++) {
      if (arr[j] < pivot) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
      }
    }
    int temp = arr[i];
    arr[i] = pivot;
    arr[high] = temp;
    return i;
  }

  // Merge sort
  public void mergeSort(int[] arr, int start, int end) {

    if (start < end) {
      int mid = (start + end) / 2;
      mergeSort(arr, start, mid);
      mergeSort(arr, mid + 1, end);
      merge(arr, start, mid, end);

    }
  }

  private void merge(int[] arr, int start, int mid, int end) {
    int p = start;
    int q = mid + 1;
    int A[] = new int[end - start + 1];
    int k = 0;
    while (p <= mid && q <= end) {
      if (arr[p] < arr[q]) {
        A[k] = arr[p];
        k++;
        p++;
      } else {
        A[k] = arr[q];
        k++;
        q++;
      }
    }

    while (p <= mid) {
      A[k++] = arr[p++];
    }

    while (q <= end) {
      A[k++] = arr[q++];
    }

    for (int i = end; i >= start; i--) {
      arr[i] = A[--k];
    }

  }

  public void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
