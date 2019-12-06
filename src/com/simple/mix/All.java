package com.simple.mix;

import java.util.ArrayList;
import java.util.Arrays;

public class All {

  // remove duplicates from array

  void removeDuplicates2() {
    int nums[] = new int[] {10, 20, 30, 25, 15, 10, 35, 20, 25, 65, 50, 75, 35, 90, 15, 25};
    int size = nums.length;
    for (int i = 0; i < size; i++) {

    }

  }

  void removeDuplicates() {
    int nums[] = new int[] {10, 20, 30, 25, 15, 10, 35, 20, 25, 65, 50, 75, 35, 90, 15, 25};
    int size = nums.length;
    int newSize = 1;
   
    for (int i = 0; i < size; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println("");
    System.out.println("After Removing Duplicates");
   

    for (int i = 1; i < size; i++) {
      int num = nums[i];
      boolean flag = true;
      int initial_position = i;
      // found duplicate/ already exists
      for (int j = 0; j < newSize; j++) {
        if (nums[j] == num) {
          for (int k = i; k < size - 1; k++) {
            nums[k] = nums[k + 1];
          }
          size = size - 1;
          flag = false;
          
        }
      }
      // New entry
      if (flag) {
        newSize += 1;
      }else{
        i = initial_position-1;
      }

    }

    for (int i = 0; i < newSize; i++) {
      System.out.print(nums[i] + " ");
    }

  }

  public void patterns() {

    int n = 5;
    for (int i = n; i > 0; i--) {
      for (int j = i; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    System.out.println("---------");

    for (int i = 1; i < n + 1; i++) {
      int stars = (i * 2) - 1;
      int spaces = (((n * 2) - 1) - stars) / 2;
      for (int j = 0; j <= spaces; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < stars; j++) {
        System.out.print("*");
      }

      System.out.println("");
    }

  }

  public void bubbleSort() {
    int nums[] = {5, 1, 6, 2, 4, 10, 3};
    int n = nums.length;

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (nums[j] > nums[j + 1]) {
          int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
      }
    }

    for (int i = 0; i < n; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println("");
    System.out.println("at index " + search(nums, 4));
  }

  public int search(int nums[], int n) {
    int start = 0;
    int end = nums.length;

    while (end >= start) {
      int mid = (start + end) / 2;

      if (n == nums[mid]) {
        return mid;
      } else if (n < nums[mid]) {
        end = mid - 1;
      } else if (n > nums[mid]) {
        start = mid + 1;
      }
    }

    return -1;
  }

  public void checkRotational() {
    String s1 = "abcdd";
    String s2 = "cddab";

    if (s1.length() != s2.length()) {
      System.out.println("not rotational");
    }
    String s3 = s1.concat(s1);
    if (s3.contains(s2)) {
      System.out.println("Strings are rotational");
    } else {
      System.out.println("Strings are not rotational");
    }

    char start = s1.charAt(0);
    int index = s2.indexOf(start);
    String rotated = s2.substring(index, s2.length()) + s2.substring(0, index);
    if (s1.equals(rotated)) {
      System.out.println("Strings are rotational");
    } else {
      System.out.println("Strings are not rotational");
    }
  }

  public void stringOps() {

    String s1 = "asdfsg";
    StringBuffer sb = new StringBuffer(s1);
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
    System.out.println(s1.indexOf('s'));
    System.out.println(s1.substring(1));
    System.out.println(s1.substring(1, 4));
    System.out.println(s1.replaceFirst("s", "zzzzzzz"));
    System.out.println(s1);
    System.out.println(sb);
    System.out.println(s1.indexOf("d"));

    String s2 = "jan-feb-march";
    String months[] = s2.split("-");
    for (int i = 0; i < months.length; i++) {
      System.out.println(months[i]);
    }

    String s3 = "GeeksforGeEks";
    StringBuffer sb1 = new StringBuffer();
    ArrayList<Character> unique = new ArrayList<Character>();
    for (int i = 0; i < s3.length(); i++) {
      if (!unique.contains(s3.charAt(i))) {
        unique.add(s3.charAt(i));
      }
    }
    System.out.println(unique);

    for (int i = 0; i < unique.size(); i++) {
      System.out.println(unique.get(i) + " " + countChars(s3.toUpperCase(), unique.get(i)));
    }

  }

  public int countChars(String str, char s) {
    int count = 0;
    char m = Character.toUpperCase(s);
    for (int i = 0; i < str.length(); i++) {
      if (m == str.charAt(i)) {
        count += 1;
      }
    }
    return count;
  }

  public void minSecond() {
    int nums[] = {46, 20, 73, 42, 12, 89, 33, 45};
    int min = nums[0];
    int which = 8;

    for (int j = 0; j < which; j++) {
      min = nums[j];
      int index = j;
      for (int i = j + 1; i < nums.length; i++) {
        if (min > nums[i]) {
          min = nums[i];
          index = i;
        }
      }
      int temp = nums[j];
      nums[j] = min;
      nums[index] = temp;

    }
    System.out.println("The " + which + " minimum number is " + min);

  }

  // maximum sum incremental Qual
  public void maxSumInc() {
    int nums[] = new int[] {3, 2, 4, 5, 1, 6, 9};
    int maxSum = 0;
    int startIndex = 0;
    int endIndex = 0;
    int i = 0;
    int maxIndex = nums.length - 2;
    while (i < maxIndex) {
      // System.out.println(nums[i]);
      int sum = nums[i];
      int indexStart = i;
      while (nums[i] < nums[i + 1]) {

        sum += nums[i + 1];
        i += 1;
        if (i > maxIndex) {
          break;
        }

      }
      if (sum > maxSum) {
        startIndex = indexStart;
        maxSum = sum;
        endIndex = i;
      }
      // endIndex = i;
      i += 1;
    }

    System.out.println("Start Index:" + startIndex);
    System.out.println("End Index:" + endIndex);
    System.out.println("Max Sum " + maxSum);

  }

  public String returnFromTry() {
    try {
      return "Return from try block";
    } finally {
      System.out.println("Executing Finally Block");
      // return "Return from finally block";
    }
  }
}
