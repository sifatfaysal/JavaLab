package cse101lab1;

import java.util.Scanner;

public class EX03 {

    public static int nextPrime(int num) {
        num++;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                num++;
                i = 2;
            } else {
                continue;
            }
        }
        return num;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num = input.nextInt();
        System.out.println("NextPrime(" + num + ") = " + nextPrime(num));
    }
}
