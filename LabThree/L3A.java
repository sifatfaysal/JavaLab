package LabThree;

import java.util.Scanner;

public class L3A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int number = input.nextInt();
        System.out.println();
        if (number % 2 == 0) {
            System.out.println(number + " is Even Number");
        } else {
            System.out.println(number + " is Odd Number");
        }
        System.out.println("Bye !");
    }
}
