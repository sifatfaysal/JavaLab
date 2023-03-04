package cse101lab1;

import java.util.Scanner;

public class EX08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        Scanner in = new Scanner(System.in);
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
