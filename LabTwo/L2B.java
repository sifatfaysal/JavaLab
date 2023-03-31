package LabTwo;

import javax.swing.JOptionPane;

public class L2B {

    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog(null, "Enter Any Number : ", "Input Dialog",
                JOptionPane.QUESTION_MESSAGE);
        int a = Integer.parseInt(num);
        if (a % 2 == 0 || a % 3 == 0) {
            JOptionPane.showMessageDialog(null, "TRUE", "Output Dialog", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "FALSE", "Output Dialog", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
