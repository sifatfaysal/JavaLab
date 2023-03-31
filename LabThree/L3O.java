package LabThree;

import java.util.Scanner;

public class L3O {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter The Rows : ");
            int rows = input.nextInt();
            System.out.println();
            int k = rows * 2 - 1;
            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= k; j++) {
                    if (j == i || j == k - i + 1) {
                        System.out.print("*");
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}