package LabOne;

import java.util.Scanner;

public class L1I {

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int num, rev = 0;
      System.out.print("Enter The Number : ");
      num = input.nextInt();
      while (num != 0) {
        int r = num % 10;
        rev = rev * 10 + r;
        num = num / 10;
      }
      System.out.println("The Reverse Number is: " + rev);
    }
  }
}