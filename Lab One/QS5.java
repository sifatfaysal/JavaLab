package cse101lab1;

import java.util.Scanner;

public class EX05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, r, result = 0;
        System.out.print("Enter Any Number : ");
        num1 = input.nextInt();
        num2 = num1;
        while (num2 != 0) {
            r = num2 % 10;
            result += r * r * r;
            num2 /= 10;
        }
        if (result == num1) {
            System.out.println("This is an Armstrong Number.");
        } else {
            System.out.println("This is not an Armstrong Number.");
        }
    }
}
