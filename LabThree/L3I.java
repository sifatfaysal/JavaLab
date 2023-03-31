package LabThree;

import java.util.Scanner;

public class L3I {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter The Rows : ");
            int rows = input.nextInt();
            System.out.println();
            for (int i = rows; i >= 0; i--) {
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
