package LabThree;

import java.util.Scanner;

public class L34 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int k = 0, l = 1;
      System.out.print("Enter The Rows : ");
      int rows = input.nextInt();
      System.out.println();
      for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++, k++, l++) {
          if (k % 2 == 0) {
            System.out.printf("%4c", (char)(l + 64));
          } else {
            System.out.printf("%4c", (char)(l + 96));
          }
        }
        System.out.println();
      }
    }
  }
}