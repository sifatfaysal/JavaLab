package cse101lab2;

import javax.swing.JOptionPane;

public class EX1 {

    public static void main(String[] args) {
        double area, perimeter;
        String radius = JOptionPane.showInputDialog(null, "Enter The Radius : ", "Input Dialog",
                JOptionPane.QUESTION_MESSAGE);
        double r = Integer.parseInt(radius);
        area = 2 * 3.1416 * r;
        perimeter = 3.1416 * r * r;
        JOptionPane.showMessageDialog(null, "Circle Area : " + area + "\nCircle Perimeter : " + perimeter,
                "OutPut Dialog", JOptionPane.INFORMATION_MESSAGE);
    }
}
