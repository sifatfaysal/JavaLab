package LabThree;

import java.util.Scanner;

public class L3X {
    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean emirp(int n) {
        if (prime(n) == false) {
            return false;
        }
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return prime(rev);
    }

    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter The Number : ");
            int n = input.nextInt();
            if (emirp(n) == true) {
                System.out.println("Yes, " + n + " Emirp Number");
            } else {
                System.out.println("No, " + n + " Not Emirp Number");
            }
        }
    }
}
