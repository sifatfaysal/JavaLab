package LabThree;

import java.util.Scanner;

public class L3S {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter The Number : ");
      int num = input.nextInt();
      sunnynumber(num);
    }
  }

  static boolean squ(double num1) {
    double square_root = Math.sqrt(num1);
    return ((square_root - Math.floor(square_root)) == 0);
  }

  static void sunnynumber(int num2) {
    if (squ(num2 + 1)) {
      System.out.println("Sunny Number");
    } else {
      System.out.println("Not A Sunny Number");
    }
  }
}