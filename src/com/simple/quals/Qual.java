package com.simple.quals;

import java.util.HashSet;
import java.util.Iterator;

public class Qual {

  public static void main(String args[]) {
    Qual qual = new Qual();
    qual.spiralMatrix();
    // qual.empoloyeeOps();
    Sorting sort = new Sorting();
    // sort.sortOps();
    // sort.sortOps2();
    // sort.sortOps3();
    // sort.sortOps4();
    // sort.sortOps5();
  }

  public void empoloyeeOps() {
    Employee e1 = new Employee("Harry", "Potter");
    Employee e2 = new Employee("Tom", "Riddle");
    Employee e3 = new Employee("Harry", "Potter");
    HashSet<Employee> set = new HashSet<Employee>();
    set.add(e1);
    set.add(e2);
    set.add(e3);

    System.out.println(set);
    Iterator<Employee> itr = set.iterator();
    while (itr.hasNext()) {
      Employee e = itr.next();
      System.out.println(e.firstName + " " + e.lastName);
    }
  }

  public void spiralMatrix() {
    int matrix[][] = new int[][] {{0, 1, 2, 3, 4}, {10, 11, 12, 13, 14}, {20, 21, 22, 23, 24}, {30, 31, 32, 33, 34}, {40, 41, 42, 43, 44}};
    char dir = 'T';
    int row_max = matrix.length - 1;
    int col_max = matrix[0].length - 1;
    int row_min = 0;
    int col_min = 0;

    while (row_min <= row_max) {
      if (dir == 'T') {
        for (int j = col_min; j <= col_max; j++) {
          System.out.print(matrix[row_min][j] + " ");
        }
        row_min += 1;
        dir = 'R';
      } else if (dir == 'R') {
        for (int i = row_min; i <= row_max; i++) {
          System.out.print(matrix[i][col_max] + " ");
        }
        col_max -= 1;
        dir = 'B';
      } else if (dir == 'B') {
        for (int j = col_max; j >= col_min; j--) {
          System.out.print(matrix[row_max][j] + " ");
        }
        row_max -= 1;
        dir = 'L';
      } else if (dir == 'L') {
        for (int j = row_max; j >= row_min; j--) {
          System.out.print(matrix[j][col_min] + " ");
        }
        col_min += 1;
        dir = 'T';
      }
    }

  }
}
