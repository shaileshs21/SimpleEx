package com.simple.quals;

public class HeapSort {

  public void heapSort(int arr[],int n){
    for(int i=n/2 -1;i>=0;i--){
      heapify(arr, n, i);
    }
    
    for(int  i= n-1;i>=0;i--){
      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;
      
      heapify(arr,i,0);
    }
  }
  
  private void heapify(int arr[],int n,int i){
    int largest = i;
    int l = i*2+1;
    int r = i*2+2;
    
    if(l<n && arr[largest]<arr[l]){
      largest =l;
    }
    if(r<n && arr[largest]<arr[r]){
      largest = r;
    }
    
    if(largest!=i){
      int temp = arr[i];
      arr[i] = arr[largest];
      arr[largest] = temp;
      
      // Move the newly added value i.e from i to its proper position is heap structure
      //imp
      heapify(arr, n, largest);
    }
    
  }
}
