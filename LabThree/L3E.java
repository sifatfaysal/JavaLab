package LabThree;

import java.util.Scanner;

public class L3E {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter The Size : ");
            int size = input.nextInt();
            System.out.println();
            int i = 1;
            do {
                int j = 1;
                while (j <= size) {
                    System.out.print("#");
                    j++;
                }
                System.out.println();
                i++;
            } while (i <= size);
        }
    }
}