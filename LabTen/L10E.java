package LabTen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L10E {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      try {
        String h;
        h = sc.nextLine();
        if (h.length() <= 3) {
          throw new MyException(h.length());
        }
        int a = Integer.parseInt(h);
        int arr[] = new int[10];
        int index = sc.nextInt();
        arr[index] = 4;
        int num = sc.nextInt();
        if (num == 0) {
          throw new ArithmeticException();
        }
        double div = 40.0 / num;
        arr[index] = (int) div;
      } catch (NumberFormatException e) {
        System.out.println(e);
        System.out.println("Exception Handling Completed");
        System.exit(0);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e);
        System.out.println("Exception Handling Completed");
        System.exit(0);
      } catch (InputMismatchException e) {
        System.out.println(e);
        System.out.println("Exception Handling Completed");
        System.exit(0);
      } catch (ArithmeticException e) {
        System.out.println(e);
        System.out.println("Exception Handling Completed");
        System.exit(0);
      } catch (MyException e) {
        System.out.println("MyException[" + e + "]");
        System.out.println("Exception Handling Completed");
        System.exit(0);
      }
    }
    System.out.println("Exception Encountered");
  }
}

class MyException extends Exception {

  int a;

  public MyException(int a) {
    this.a = a;
  }

  @Override
  public String toString() {
    return Integer.toString(a);
  }
}