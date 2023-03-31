package LabThree;

import java.util.Random;
import java.util.Scanner;

public class L3J {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      Random randnumber = new Random();
      final int maximum = 100;
      boolean correct = false;
      int answer = randnumber.nextInt(maximum) + 1;
      while (!correct) {
        System.out.print("Enter The Number (Limit 1 To 100) :");
        int num = input.nextInt();
        if (num > answer) {
          System.out.println("Too High, Try Again !\n");
        } else if (num < answer) {
          System.out.println("Too Low, Try Again !\n");
        } else {
          System.out.println("Yes, You Guessed The Number.\n");
          correct = true;
        }
      }
    }
    System.exit(0);
  }
}