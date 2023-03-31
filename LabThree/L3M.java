package LabThree;

import java.util.Scanner;

public class L3M {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int sum = 0, temp, r;
      System.out.print("Enter Any Number : ");
      int num = input.nextInt();
      temp = num;
      while (temp != 0) {
        r = temp % 10;
        sum = sum * 10 + r;
        temp = temp / 10;
      }
      if (num == sum) {
        System.out.println("It is a Palindrome.");
      } else {
        System.out.println("Not a Palindrome.");
      }
    }
  }
}