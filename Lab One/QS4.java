package cse101lab1;

import java.util.Scanner;

public class EX04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, fac = 1;
        System.out.print("Input The Number : ");
        num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            fac *= i;
        }
        System.out.println("The Fact of " + num + " is : " + fac);
    }
}
