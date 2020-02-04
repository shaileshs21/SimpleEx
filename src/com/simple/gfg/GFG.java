package com.simple.gfg;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

class GFG {

  public void nonRepeatingCharacter() {

    Scanner obj = new Scanner(System.in);
    int t = obj.nextInt();
    while (t-- > 0) {
      int n = obj.nextInt();
      HashMap<Character, Integer> map = new LinkedHashMap<>();
      for (int i = 0; i < n; i++) {
        char ch = obj.next().charAt(0);
        if (map.containsKey(ch)) {
          int cnt = map.get(ch);
          cnt++;
          map.put(ch, cnt);
        } else {
          map.put(ch, 1);
        }
        boolean flag = true;
        for (Character c : map.keySet()) {
          if (map.get(c) == 1) {
            System.out.print(c + " ");
            flag = false;
            break;
          }
        }
        if (flag) {
          System.out.print("-1 ");
        }
      }
      map.clear();
    }

  }

  public void firstCircularTour() {

    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t > 0) {
      int n = sc.nextInt();
      sc.nextLine();
      String str = sc.nextLine();
      String arr[] = str.split(" ");
      int p[] = new int[n];
      int d[] = new int[n];
      int j = 0;
      int k = 0;
      for (int i = 0; i < 2 * n; i++) {
        if (i % 2 == 0) {
          p[j] = Integer.parseInt(arr[i]);
          j++;
        } else {
          d[k] = Integer.parseInt(arr[i]);
          k++;
        }
      }

      System.out.println(tour(p, d));
      t--;
    }
  }

  private static int tour(int petrol[], int distance[]) {

    int n = petrol.length;
    int location = 0;
    boolean flag = false;
    while (location++ < n) {
      int totalPetrol = 0;
      int nextPetrolPumpDistance = 0;
      int totalDistance = 0;
      int startLocation = location;
      flag = true;
      for (int i = 0; i < n; i++) {
        totalPetrol += petrol[startLocation];
        nextPetrolPumpDistance = distance[startLocation];
        totalDistance += nextPetrolPumpDistance;
        if (startLocation == n - 1) {
          startLocation = 0;
        } else {
          startLocation++;
        }

        if (totalDistance <= totalPetrol) {
          totalPetrol = totalPetrol - nextPetrolPumpDistance;
          totalDistance -= nextPetrolPumpDistance;
        } else {
          flag = false;
          break;
        }
      }
      if (flag == true) {
        break;
      }

    }

    if (flag) {
      return location;
    } else {
      return -1;
    }
  }

  public void sentenceToKeypad() {
    Map<Character, Integer> keys = new LinkedHashMap<>();
    keys.put('A', 2);
    keys.put('B', 22);
    keys.put('C', 222);
    keys.put('D', 3);
    keys.put('E', 33);
    keys.put('F', 333);
    keys.put('G', 4);
    keys.put('H', 44);
    keys.put('I', 444);
    keys.put('J', 5);
    keys.put('K', 55);
    keys.put('L', 555);
    keys.put('M', 6);
    keys.put('N', 66);
    keys.put('O', 666);
    keys.put('P', 7);
    keys.put('Q', 77);
    keys.put('R', 777);
    keys.put('S', 7777);
    keys.put('T', 8);
    keys.put('U', 88);
    keys.put('V', 888);
    keys.put('W', 9);
    keys.put('X', 99);
    keys.put('Y', 999);
    keys.put('Z', 9999);
    keys.put(' ', 0);
    Scanner obj = new Scanner(System.in);
    int t = obj.nextInt();
    obj.useDelimiter("\n");

    while (t-- > 0) {
      // String str = obj.next();
      String str;

      str = obj.next();

      for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (c == ' ') {
          System.out.print("0");
        } else {
          System.out.print(keys.get(c) + "");
        }
      }
      System.out.println("");

    }
  }

  public void div8() {
    Scanner obj = new Scanner(System.in);
    int t = obj.nextInt();
    while (t-- > 0) {
      String number = obj.next();
      number = number.substring(number.length() - 3, number.length());
      int num = Integer.parseInt(number);
      System.out.println(num);
    }
  }

  public void sumOfArrayofnIntegers() {
    Scanner obj = new Scanner(System.in);
    int t = obj.nextInt();
    while (t-- > 0) {
      int n = obj.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = obj.nextInt();
      }
      int sum = 0;
      for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
          if ((Math.abs(arr[j] - arr[i]) > 1)) {
            sum += (arr[j] - arr[i]);
          }
        }
      }
      System.out.println(sum);
    }
  }

  public void printArray(Object[] obj) {
    for (int i = 0; i < obj.length; i++) {
      System.out.println(obj[i]);

    }
  }
  /*
   * public void permutationOfString(){ // ABC ACB BAC BCA CAB CBA String str = "ABC"; permute("",str); } private static String p ermute(String
   * fix,String str){ if(str == null){ return fix; }else{ fix = str.; for(int i =1;i<str.length();i++){ } } }
   */

  public void reverseWords() {
    String str = "i.like.this.program.very.much";

    String[] strArray = str.split("\\.");
    for (int i = strArray.length - 1; i >= 0; i--) {
      System.out.print(strArray[i]);
      if (i != 0) {
        System.out.print(".");
      }
    }
  }

  public void parenthesisChecker() {
    String string = "))))))";// "[()]{}{[()()]()}";
    Stack<Character> stack = new Stack<>();
    boolean flag = false;
    if (string.length() % 2 != 0) {
      System.out.println("not balanced");
      return;
    }
    for (int i = 0; i < string.length(); i++) {
      char c = string.charAt(i);
      if (c == '{' || c == '(' || c == '[') {
        stack.push(c);
      }
      if (stack.isEmpty()) {
        flag = true;
        break;
      }
      if (c == '}') {
        if (stack.pop() != '{') {
          flag = true;
          break;
        }
      }
      if (c == ']') {
        if (stack.pop() != '[') {
          flag = true;
          break;
        }
      }
      if (c == ')') {
        if (stack.pop() != '(') {
          flag = true;
          break;
        }
      }
    }
    if (flag) {
      System.out.println("not balanced");
    } else {
      System.out.println("balanced");
    }
  }

  public void reverseString() {
    String str = "GeeksforGeeks";
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
      stack.push(str.charAt(i));
    }
    StringBuilder builder = new StringBuilder();
    while (!stack.isEmpty()) {
      builder.append(stack.pop());
    }
    System.out.println(builder);
  }

  public void queueOperations2() {
    Queue<Integer> q2 = new LinkedList<> ();
    Queue<Integer> q = new PriorityQueue<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    System.out.println(q);
    Stack<Integer> stack = new Stack<>();
    Queue<Integer> queue = new LinkedList<>();
    int k = 3;
    for (int i = 0; i < k; i++) {
      stack.push(q.remove());
    }
    for (int i = 0; i < k; i++) {
      queue.add(stack.pop());
    }
    while (!q.isEmpty()) {
      queue.add(q.remove());
    }

    System.out.println(queue);
  }
  
  public void queueOperations3() {
    Queue<Integer> q = new PriorityQueue<>();
    q.add(5);
    q.add(2);
    q.add(1);
    q.add(4);
    q.add(3);
    System.out.println(q);
    while (!q.isEmpty()) {
      System.out.println(q.remove());
    }
  }

  public void queueOperations() {
    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    System.out.println(q);
    int size = q.size();
    int arr[] = new int[size];
    int k = 3;
    for (int i = k - 1; i >= 0; i--) {
      arr[i] = q.remove();
    }
    for (int i = k; i < size; i++) {
      arr[i] = q.remove();
    }
    int i = 0;
    while (size-- > 0) {
      q.add(arr[i]);
      i++;
    }

    System.out.println(q);
  }

  public void stackOperatios() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      Stack<Integer> stack = new Stack<>();
      int q = sc.nextInt();
      q *= 2;
      while (q-- > 0) {
        char ch = sc.next().charAt(0);
        if (ch == 'i') {
          int num = sc.nextInt();
          stack.push(num);
        } else if (ch == 'r') {
          stack.pop();
        } else if (ch == 'h') {
          System.out.println(stack.peek());
        } else if (ch == 'f') {
          int num = sc.nextInt();
          if (stack.contains(num)) {
            System.out.println("Yes");
          } else {
            System.out.println("No");
          }
        }
      }
    }

  }

  public void priorityQueue() {
    Comparator<Integer> comparator = new Comparator<Integer>() {

      @Override
      public int compare(Integer o1, Integer o2) {
        // TODO Auto-generated method stub
        return o2 - o1;
      }
    };
    PriorityQueue<Integer> queue = new PriorityQueue<>(comparator);

    queue.add(10);
    queue.add(20);
    queue.add(15);
    System.out.println(queue);
    System.out.println(queue.poll());
    // System.out.println(queue.remove(20));
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

      quickSort(arr, 0, arr.length - 1);

      System.out.println(arr[k - 1]);

    }
  }

  private void quickSort(int a[], int p, int r) {
    if (p < r) {
      int q = partition(a, p, r);
      quickSort(a, p, q - 1);
      quickSort(a, q + 1, r);
    }
  }

  private int partition(int[] a, int p, int r) {
    int pivot = a[r];
    int pivot_position = p;
    for (int i = p; i < r; i++) {
      if (a[i] < pivot) {
        int temp = a[pivot_position];
        a[pivot_position] = a[i];
        a[i] = temp;
        pivot_position++;
      }
    }
    int temp = a[pivot_position];
    a[pivot_position] = pivot;
    a[r] = temp;
    return pivot_position;
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
