package LabTwo;

import javax.swing.JOptionPane;

public class L2D {

  public static void main(String[] args) {
    String num = JOptionPane.showInputDialog(null, "Enter (a) Value : ", "Input Dialog",
      JOptionPane.QUESTION_MESSAGE);
    double a = Double.parseDouble(num);
    String num1 = JOptionPane.showInputDialog(null, "Enter (b) Value : ", "Input Dialog",
      JOptionPane.QUESTION_MESSAGE);
    double b = Double.parseDouble(num1);
    String num2 = JOptionPane.showInputDialog(null, "Enter (c) Value : ", "Input Dialog",
      JOptionPane.QUESTION_MESSAGE);
    double c = Double.parseDouble(num2);
    double dis = Math.sqrt((b * b) - (4 * a * c));
    if (dis > 0) {
      double answer1 = ((b * (-1)) + dis) / (2 * a);
      double answer2 = ((b * (-1)) - dis) / (2 * a);
      JOptionPane.showMessageDialog(null,
        "The Equation Has Two Roots : " + answer1 + " And " + answer2,
        "Output Dialog",
        JOptionPane.INFORMATION_MESSAGE);
    } else if (dis == 0) {
      double answer = ((b * (-1)) - dis) / (2 * a);
      JOptionPane.showMessageDialog(null, answer + "The Equation Has One Roots : ", "Output Dialog",
        JOptionPane.INFORMATION_MESSAGE);

    } else {
      JOptionPane.showMessageDialog(null, "The Equation Has No Real Roots : ", "Output Dialog",
        JOptionPane.INFORMATION_MESSAGE);
    }
  }
}