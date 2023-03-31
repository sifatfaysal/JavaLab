package LabThree;

import java.util.Scanner;

public class L3V {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter The Number : ");
      int num = input.nextInt();
      System.out.println();
      int rev = 0;
      for (; num != 0; num /= 10) {
        int temp = num % 10;
        rev = rev * 10 + temp;
      }
      System.out.println("Reverse Number Is : " + rev);
    }
  }
}