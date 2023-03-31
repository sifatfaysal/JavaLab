package LabThree;

import java.util.Scanner;

public abstract class L32 {

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter The Rows : ");
      int rows = input.nextInt();
      System.out.println();
      for (int i = rows / 2; i <= rows; i += 2) {
        for (int j = 1; j < rows - i; j += 2) {
          System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
          System.out.print("*");
        }
        for (int j = 1; j <= rows - i; j++) {
          System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
      for (int i = rows; i >= 1; i--) {
        for (int j = i; j < rows; j++) {
          System.out.print(" ");
        }
        for (int j = 1; j <= (i * 2) - 1; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }
}