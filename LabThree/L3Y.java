package LabThree;

import java.util.Scanner;

public class L3Y {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter The Year : ");
      int year = input.nextInt();
      if (year % 400 == 0) {
        System.out.println(year + " is a leap year");
      } else if (year % 100 == 0) {
        System.out.println(year + " is not a leap year");
      } else if (year % 4 == 0) {
        System.out.println(year + " is a leap year");
      } else {
        System.out.println(year + " is not a leap year");
      }
    }
  }
}