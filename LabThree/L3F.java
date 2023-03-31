package LabThree;

import java.util.Scanner;

public class L3F {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter The Rows : ");
            int rows = input.nextInt();
            System.out.println();
            for (int i = 0; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + "");
                }
                System.out.println();
            }
        }
    }
}