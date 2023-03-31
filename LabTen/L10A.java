package LabTen;

import java.util.Scanner;

public class L10A {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      final int size = 4;
      double num1, num2;
      Calculator[] cal = new Calculator[4];
      while (true) {
        try {
          for (int i = 0; i < size; i++) {
            System.out.println("Input The Object " + (i + 1) +
              " Info : ");
            System.out.print("Input Number 01 : ");
            num1 = input.nextDouble();
            System.out.print("Input Number 01 : ");
            num2 = input.nextDouble();
            cal[i] = new Calculator(num1, num2);
            switch (i) {
            case 0 ->
            System.out.println("Additon is : " +
              cal[i].Addition());
            case 1 ->
            System.out.println("Substraction is : " +
              cal[i].Subtraction());
            case 2 ->
            System.out.println("Multiplication is : " + cal[i].Multiplication());
            default ->
            System.out.println("Division is : " +
              cal[i].Division());
            }
          }
        } catch (NumberFormatException e) {
          System.out.println("Numeric");
          break;
        } catch (ArithmeticException ae) {
          System.out.println("Not Negative.");
        }
      }
    }
  }
}

class Calculator {

  private double n1;
  private double n2;

  public Calculator(double firstNumber, double secondNumber) {
    this.n1 = firstNumber;
    this.n2 = secondNumber;
  }

  public double getFirstNumber() {
    return n1;
  }

  public double getSecondNumber() {
    return n2;
  }

  public void setFirstNumber(double firstNumber) {
    this.n1 = firstNumber;
  }

  public void setSecondNumber(double secondNumber) {
    this.n2 = secondNumber;
  }

  public double Addition() {
    double sum = n1 + n2;
    if (sum < 0) {
      throw new ArithmeticException();
    } else {
      return sum;
    }
  }

  public double Subtraction() {
    double sub = n1 - n2;
    if (sub < 0) {
      throw new ArithmeticException();
    }
    return sub;
  }

  public double Multiplication() {
    if (n1 == 0 || n2 == 0) {
      throw new ArithmeticException();
    }
    return n1 * n2;
  }

  public double Division() {
    if (n1 == 0 || n2 == 0) {
      throw new ArithmeticException();
    } else {
      return n1 / n2;
    }
  }
}