package LabTwo;

import javax.swing.JOptionPane;

public class L2E {

        public static void main(String[] args) {
                String num1 = JOptionPane.showInputDialog(null, "Enter The (P) Value : ", "Input Dialog",
                                JOptionPane.QUESTION_MESSAGE);
                double p = Double.parseDouble(num1);
                String num2 = JOptionPane.showInputDialog(null, "Enter The (Q) Value : ", "Input Dialog",
                                JOptionPane.QUESTION_MESSAGE);
                double q = Double.parseDouble(num2);
                String num3 = JOptionPane.showInputDialog(null, "Enter The (R) Value : ", "Input Dialog",
                                JOptionPane.QUESTION_MESSAGE);
                double r = Double.parseDouble(num3);
                String num4 = JOptionPane.showInputDialog(null, "Enter The (P) Value : ", "Input Dialog",
                                JOptionPane.QUESTION_MESSAGE);
                double x = Double.parseDouble(num4);
                String num5 = JOptionPane.showInputDialog(null, "Enter The (Q) Value : ", "Input Dialog",
                                JOptionPane.QUESTION_MESSAGE);
                double y = Double.parseDouble(num5);
                if (((x - p) * (x - p) + (y - q) * (y - q)) > (r * r)) {
                        JOptionPane.showMessageDialog(null, "(" + (int) p + ","
                                        + (int) q + ") is Outside The Cicle", "Output Dialog",
                                        JOptionPane.INFORMATION_MESSAGE);
                } else {
                        JOptionPane.showMessageDialog(null, "(" + (int) p + ","
                                        + (int) q + ") is Inside The Cicle", "Output Dialog",
                                        JOptionPane.INFORMATION_MESSAGE);
                }
        }
}
