package LabThree;

import java.util.Scanner;

public class L3L {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter The Rows : ");
            int rows = input.nextInt();
            System.out.println();
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= 10 - i + 1; j++) {
                    System.out.print("*");
                }
                for (int k = 1; k <= 2 * i - 2; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 10 - i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = rows; i >= 1; i--) {
                for (int j = i; j <= 10; j++) {
                    System.out.print("*");
                }
                for (int k = 1; k <= (2 * i) - 2; k++) {
                    System.out.print(" ");
                }
                for (int j = i; j <= 10; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}