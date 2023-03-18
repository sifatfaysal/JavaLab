package Lab Ten;

import java.util.Scanner;

public class P3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      int a[] = new int[5];
      a[0] = input.nextInt();
      a[6] = 20 / 0;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBounds Exception occurs");
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception occurs");
    } catch (NumberFormatException e) {
      System.out.println("Input should be numeric.");
    } catch (Exception e) {
      System.out.println("Parent Exception occurs");
    } finally {
      System.out.println("All task completed");
    }
  }
}