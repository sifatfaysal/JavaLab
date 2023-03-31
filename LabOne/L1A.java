package LabOne;

import java.util.Scanner;

public class L1A {

  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int num;
      System.out.print("Enter Your Number : ");
      num = input.nextInt();
      if (num >= 80) {
        System.out.println("A");
      } else if (num >= 60) {
        System.out.println("B");
      } else if (num >= 50) {
        System.out.println("C");
      } else if (num >= 45) {
        System.out.println("D");
      } else if (num >= 25) {
        System.out.println("E");
      } else {
        System.out.println("F");
      }
    }
  }
}