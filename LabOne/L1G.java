package LabOne;

import java.util.Scanner;

public class L1G {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            float hei, wid, area, perimeter;
            System.out.print("Enter Height of Rectangle: ");
            hei = input.nextFloat();
            System.out.print("Enter Width of Rectangle: ");
            wid = input.nextFloat();
            perimeter = 2 * (hei + wid);
            area = hei * wid;
            System.out.println("Area is " + hei + "*" + wid + " = "
                    + area);
            System.out.println("Perimeter is 2*(" + hei + "+" + wid + ")= " + perimeter);
        }
    }
}
