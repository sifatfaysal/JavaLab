package LabThree;

import java.util.Scanner;

public class L31 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double num;
    try {
      System.out.print("Enter The Angle (SinX) For Calculate Degrees : ");
      num = input.nextInt();
    } catch (Exception e) {
      System.out.println("Hey ! It's Error !!! ");
      return;
    }
    double num1;
    num1 = num * Math.PI / 180;
    int num2 = 10;
    int i, j, fact;
    double sine = 0;
    for (i = 0; i <= num2; i++) {
      fact = 1;
      for (j = 2; j <= 2 * i + 1; j++) {
        fact *= j;
      }
      sine += Math.pow(-1.0, i) * Math.pow(num1, 2 * i + 1) /
        fact;
    }
    System.out.format("The (SinX) Of " + num + " is : %f\n",
      sine);
  }
}