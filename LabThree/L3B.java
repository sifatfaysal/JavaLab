package LabThree;

import java.util.Scanner;

public class L3B {
    static void fibonumber(int number) {
        int first = 0, sec = 1, sum = 0, count = 0;
        if (number < 1) {
            return;
        }
        System.out.print("The Fibonacci Series : ");
        System.out.print(first + " ");
        for (int i = 1; i < number; i++) {
            System.out.print(sec + " ");
            int next = first + sec;
            first = sec;
            sec = next;
            sum += next;
            count++;
        }
        System.out.println("\nThe Average is : " + sum / (double) (count == 0 ? 1 : count));
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Any Number : ");
            int number = input.nextInt();
            System.out.println();
            fibonumber(number);
        }
    }
}
