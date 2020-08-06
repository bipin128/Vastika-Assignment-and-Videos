package com.bipin.video.day2;

import javax.swing.*;

public class Calculator2 {
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("Enter the First Number"));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Enter the Second Number"));

        int sum = a + b;
        int sub = a - b;
        int div = a / b;
        int mul = a * b;

        JOptionPane.showMessageDialog(null,"The Sum of two numbers " + a + " and  " + b + " is " + sum);
        JOptionPane.showMessageDialog(null,"The Subtraction of two numbers " + a + " and  " + b + " is " + sub);
        JOptionPane.showMessageDialog(null,"The multiplication of two numbers  " + a + " and  " + b + " is " + mul);
        JOptionPane.showMessageDialog(null,"The Division of two numbers  " + a + " and  " + b + " is " + div);



    }
}
