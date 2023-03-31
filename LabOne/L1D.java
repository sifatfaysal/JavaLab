package LabOne;

import java.util.Scanner;

public class L1D {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num, fac = 1;
            System.out.print("Input The Number : ");
            num = input.nextInt();
            for (int i = 1; i <= num; i++) {
                fac *= i;
            }
            System.out.println("The Fact of " + num + " is : " + fac);
        }
    }
}
