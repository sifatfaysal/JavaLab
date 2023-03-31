package LabOne;

import java.util.Scanner;

public class L1J {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n, sum = 1, ctr = 0, num = 0;
            System.out.print("Enter The Number : ");
            n = input.nextInt();
            while (ctr < n) {
                num++;
                if (num % 2 != 0) {
                    if (is_Prime(num)) {
                        sum += num;
                        ctr++;
                    }
                }
            }
            System.out.println("");
            System.out.println("Sum of the First " + n + " Prime numbers is: " + sum);
        }
    }

    public static boolean is_Prime(int num) {
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
