package LabThree;

import java.util.Scanner;

public class L3T {
  static int fact(int n) {
    int f;
    for (f = 1; n > 1; n--) {
      f *= n;
    }
    return f;
  }

  static int pas(int n, int r) {
    return fact(n) / (fact(n - r) * fact(r));
  }

  public static void main(String args[]) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter The Number : ");
      int num = input.nextInt();
      System.out.println();
      for (int i = 0; i <= num; i++) {
        for (int j = 0; j <= num - i; j++) {
          System.out.print(" ");
        }
        for (int j = 0; j <= i; j++) {
          System.out.print(" " + pas(i, j));
        }
        System.out.println();
      }
    }
  }
}