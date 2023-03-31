package LabThree;

import java.util.Scanner;

public class L3U {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter The Number : ");
            int num = input.nextInt();
            System.out.println();
            long fact = multi(num);
            System.out.println("Factorial of " + num + " = " + fact);
        }
    }

    public static long multi(int num) {
        if (num >= 1) {
            return num * multi(num - 1);
        } else {
            return 1;
        }
    }
}
