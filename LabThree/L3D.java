package LabThree;

import java.util.Scanner;

public class L3D {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter The Rows : ");
      int rows = input.nextInt();
      System.out.println();
      for (int i = 0; i <= rows - 1; i++) {
        for (int j = 0; j <= i; j++) {
          System.out.print(" ");
        }
        for (int k = 0; k <= rows - 1 - i; k++) {
          System.out.print("#" + " ");
        }
        System.out.println();
      }
    }
  }
}