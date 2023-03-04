package cse101lab2;

import javax.swing.JOptionPane;

public class EX3 {

    public static void main(String[] args) {
        double min = 60 * 24 * 365;
        String num = JOptionPane.showInputDialog(null, "Enter The Number Of Minutes : ", "Input Dialog",
                JOptionPane.QUESTION_MESSAGE);
        int a = Integer.parseInt(num);
        long years = (long) (a / min);
        long days = (a / 60 / 24) % 365;
        JOptionPane.showMessageDialog(null, a + " Minutes is Approximately " + years + " Years And " + days + " Days",
                "OutPut Dialog", JOptionPane.INFORMATION_MESSAGE);
    }
}
