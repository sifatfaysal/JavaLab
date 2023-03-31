package LabThree;

import java.util.Scanner;

public class L3H {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter The Rows : ");
            int rows = input.nextInt();
            System.out.println();
            for (int i = 1; i <= rows; i++) {
                for (int j = 2 * (rows - i); j >= 0; j--) {
                    System.out.print(" ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
