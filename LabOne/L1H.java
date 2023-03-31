package LabOne;

import java.util.Scanner;

public class L1H {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int x, y;
            System.out.print("Enter First Integer(X) : ");
            x = input.nextInt();
            System.out.print("Enter Second Integer(Y) : ");
            y = input.nextInt();
            x = x + y;
            y = x - y;
            x = x - y;
            System.out.println("");
            System.out.println("After Swapping:");
            System.out.println("X = " + x);
            System.out.println("Y = " + y);
        }
    }
}
