package Lab Ten;

public class P4 {
  public static void main(String args[]) {
    try {
      try {
        System.out.println("Divide By 0");
        int b = 39 / 0;
      } catch (ArithmeticException e) {
        System.out.println(e);
      }
      try {
        int a[] = new int[5];
        a[5] = 4;
      } catch (ArithmeticException e) {
        System.out.println(e);
      }
      try {
        System.out.println("Divide By 0");
        int b = 39 / 1;
      } catch (ArithmeticException e) {
        System.out.println(e);
      }
      try {
        int a[] = new int[5];
        a[5] = 30 / 0;
      } catch (Exception e) {
        System.out.println("common task completed");
        System.out.println("other Statement");
      }
      System.out.println("Normal Flow");
    } catch (Exception e) {
      System.out.println("Another Statement");
    } finally {
      System.out.println("All task completed");
    }
  }
}