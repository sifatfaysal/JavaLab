package LabOne;

import java.util.Scanner;

public class L1B {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a, b, c;
            System.out.print("Enter First Angle : ");
            a = input.nextInt();
            System.out.print("Enter Second Angle : ");
            b = input.nextInt();
            System.out.print("Enter Third Angle : ");
            c = input.nextInt();
            if ((a + b <= c) || (b + c <= a) || (c + a <= b)) {
                System.out.println("This is Not a Triangle");
            } else {
                System.out.println("This is a Triangle");
                if (a == b && b == c) {
                    System.out.println("This is an Equilateral Triangle ");
                } else if (a != b && b != c && c != a) {
                    System.out.println("This is an Scalene Triangle");
                } else if ((a == b && b != c) || (a != b && c == a)
                        || (c == b && c != a)) {
                    System.out.println("This is an Isosceles Triangle");
                }
            }
        }
    }
}
