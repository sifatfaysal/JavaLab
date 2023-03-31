package LabThree;

import java.util.Scanner;

public class L33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int spc, star = 0;
        System.out.print("Enter The Rows : ");
        int rows = input.nextInt();
        System.out.println();
        for (int i = 0; i < rows; i++) {
            if (i < 5) {
                for (spc = 1; spc < 5 - i; spc++) {
                    System.out.print(" ");
                }
                while (star != (2 * i + 1)) {
                    System.out.print("*");
                    star++;
                    ;
                }
                star = 0;
                System.out.println();
            } else {
                for (int j = 0; j < 9; j++) {
                    if ((int) (j / 3) == 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}