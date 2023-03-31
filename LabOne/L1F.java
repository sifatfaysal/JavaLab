package LabOne;

import java.util.Scanner;

public class L1F {

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int i, n, f = 0;
      System.out.print("Enter The Number : ");
      n = input.nextInt();
      int m;
      m = n / 2;
      if (n == 0 || n == 1) {
        System.out.println(n + " is Not Prime Number.");
      } else {
        for (i = 2; i <= m; i++) {
          if (n % i == 0) {
            System.out.println(n + " is Not Prime Number.");
            f = 1;
            break;
          }
        }
        if (f == 0) {
          System.out.println(n + " is Prime Number");
        }
      }
    }
  }
}