package com.simple.gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class GFG {
  Comparator<Integer> comparator = new Comparator<Integer>() {
    
    @Override
    public int compare(Integer o1, Integer o2) {
      // TODO Auto-generated method stub
      return o2 - o1;
    }
  };
  public void priorityQueue() {
    PriorityQueue<Integer> queue = new PriorityQueue<>(comparator);
    queue.add(10);
    queue.add(20);
    queue.add(15);
    System.out.println(queue);
    System.out.println(queue.poll());
    //System.out.println(queue.remove(20));
    System.out.println(queue);
  }

  public void bitwise_operator() {
    int var1 = 42;
    int var2 = ~var1;
    System.out.print(var1 + " " + var2);
  }

  public void queueOperatios() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      Queue<Integer> queue = new LinkedList<>();
      int cnt = sc.nextInt();
      while (cnt-- > 0) {
        int no = sc.nextInt();
        queue.add(no);
      }

      int val = sc.nextInt();
      while (val-- > 0) {
        int no = sc.nextInt();
        int occ = 0;
        for (Integer integer : queue) {
          if (integer == no) {
            occ++;
          }
        }
        if (occ == 0) {
          System.out.println("-1");
        } else {
          System.out.println(occ);
        }

      }
    }
  }

  public void arrayListOperation2() {
    List<Integer> list = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int q = sc.nextInt();
      q *= 2;
      while (q-- > 0) {
        char ch = sc.next().charAt(0);
        if (ch == 'a') {
          int data = sc.nextInt();
          list.add(data);
        }
        if (ch == 'i') {
          Collections.sort(list);
        }
        if (ch == 'd') {
          Collections.sort(list, Collections.reverseOrder());
        }
        if (ch == 's') {
          int num = sc.nextInt();
          if (list.contains(num)) {
            int i = 0;
            for (Integer integer : list) {
              if (integer == num) {
                System.out.println(i);
                break;
              }
              i++;
            }
          } else {
            System.out.println("-1");
          }
        }
      }
    }
  }

  public void arrayListOperation() {
    List<Character> list = new ArrayList<Character>();
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int q = sc.nextInt();
      q *= 2;
      while (q-- > 0) {
        char ch = sc.next().charAt(0);
        if (ch == 'i') {
          char data = sc.next().charAt(0);
          list.add(data);
        }
        if (ch == 'f') {
          char data = sc.next().charAt(0);
          if (list.contains(data)) {
            System.out.println(Collections.frequency(list, data));
          } else {
            System.out.println("Not Present");
          }
        }
      }
    }
  }

  public void kthSmallestElement() {
    Scanner obj = new Scanner(System.in);
    int t = obj.nextInt();
    int arr2[] = new int[0];
    while (t-- > 0) {
      int n = obj.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = obj.nextInt();
      }

      int k = obj.nextInt();
      for (int i = 0; i < k; i++) {
        for (int j = i + 1; j < n; j++) {
          if (arr[i] > arr[j]) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

          }
        }
      }

      System.out.println(arr[k - 1]);

    }
  }

  public void exitPointInMatrix() {
    Scanner obj = new Scanner(System.in);
    int t = obj.nextInt();
    while (t-- > 0) {
      int rows = obj.nextInt();
      int cols = obj.nextInt();
      int arr[][] = new int[rows][cols];

      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
          arr[i][j] = obj.nextInt();
        }
      }

      int i = 0;
      int j = 0;
      char dir = 'R';
      while (i < rows && j < cols) {
        if (arr[i][j] == 1) {
          arr[i][j] = 0;
          if (dir == 'R') {
            dir = 'D';
            i++;
          } else if (dir == 'D') {
            dir = 'L';
            j--;
          } else if (dir == 'L') {
            dir = 'U';
            i--;
          } else if (dir == 'U') {
            dir = 'R';
            j++;
          }
        } else {
          if (dir == 'R') {
            j++;
          } else if (dir == 'D') {
            i++;
          } else if (dir == 'L') {
            j--;
          } else if (dir == 'U') {
            i--;
          }
        }
        if (i == -1) {
          i = 0;
          break;
        }
        if (j == -1) {
          j = 0;
          break;
        }
        if (i == rows) {
          i = rows - 1;
          break;
        }
        if (j == cols) {
          j = cols - 1;
          break;
        }
      }

      System.out.println(i + " " + j);
    }

  }

  public void snakePattern() {
    Scanner obj = new Scanner(System.in);
    int t = obj.nextInt();
    while (t-- > 0) {
      int size = obj.nextInt();
      int arr[][] = new int[size][size];
      for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
          arr[i][j] = obj.nextInt();
        }
      }

      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < size; i++) {

        if (i % 2 == 0) {
          for (int j = 0; j < size; j++) {
            sb.append(arr[i][j] + " ");
          }
        } else {
          for (int j = size - 1; j >= 0; j--) {
            sb.append(arr[i][j] + " ");
          }
        }

      }
      System.out.println(sb);
      System.out.println("");

    }
  }

  public void missingElementOfAP() {
    Scanner obj = new Scanner(System.in);
    int t = obj.nextInt();
    for (int i = 0; i < t; i++) {
      int len = obj.nextInt();
      int arr[] = new int[len];
      for (int k = 0; k < len; k++) {
        arr[k] = obj.nextInt();
      }
      int fNum = arr[0];
      int sNum = arr[1];
      int smallDiff = fNum - sNum;
      for (int j = 1; j < len - 1; j++) {
        if ((arr[j] - arr[j + 1]) < smallDiff) {
          smallDiff = arr[j] - arr[j + 1];
        }
      }
      for (int k = 0; k < len - 1; k++) {
        if ((arr[k] - arr[k + 1]) != smallDiff) {
          System.out.println(arr[k] + smallDiff);
          break;
        }
      }

    }
  }

  public void countTheZeros() {
    Scanner obj = new Scanner(System.in);
    int t = obj.nextInt();
    for (int i = 0; i < t; i++) {
      int len = obj.nextInt();
      int cnt = 0;
      for (int k = 0; k < len; k++) {
        if (obj.nextInt() != 0)
          cnt += 1;
      }
      System.out.println(len - cnt);
    }
  }

  // https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0
  void rotateClockwiseArray() {

    Scanner obj = new Scanner(System.in);
    int t = obj.nextInt();

    while (t-- > t) {
      int length = obj.nextInt();
      int size = obj.nextInt();
      int array[] = new int[length];
      for (int j = 0; j < length; j++) {
        array[j] = obj.nextInt();
      }

      int k = 0;
      for (int j = size; j < length; j++) {
        System.out.print(array[j] + " ");
      }

      for (int j = 0; j < size; j++) {
        System.out.print(array[j] + " ");
      }

      System.out.println("");

    }

  }

  public void rotateClockwiseRes() {
    Scanner in = new Scanner(System.in);
    int test = in.nextInt();
    while (test-- > 0) {
      int N = in.nextInt();
      int D = in.nextInt();
      int a[] = new int[N];
      for (int i = 0; i < N; i++) {
        a[i] = in.nextInt();
      }
      StringBuffer s = new StringBuffer();
      for (int i = D; i < N; i++) {
        s.append(a[i] + " ");
      }
      for (int i = 0; i < D; i++) {
        s.append(a[i] + " ");
      }
      System.out.println(s);
    }
  }

}
