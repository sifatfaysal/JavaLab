package LabThree;

import java.util.Scanner;

public class L3N {

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter The Rows : ");
      int rows = input.nextInt();
      System.out.println();
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < rows; j++) {
          if (j < i) {
            System.out.print(" ");
          } else {
            System.out.print("*");
          }
        }
        System.out.println();
      }
      for (int i = 2; i <= rows; i++) {
        for (int j = 0; j < rows; j++) {
          if (j < rows - i) {
            System.out.print(" ");
          } else {
            System.out.print("*");
          }
        }
        System.out.println();
      }
    }
  }
}