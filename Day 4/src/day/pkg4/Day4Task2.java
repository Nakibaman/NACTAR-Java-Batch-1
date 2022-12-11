/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day.pkg4;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class Day4Task2 {
    public static void main(String[] args) {
        String a,b;
        a=showInputDialog("Enter 1st Number -");
        int number1;
        number1=Integer.parseInt(a);
        
        b=showInputDialog("Enter 2nd Number -");
        int number2;
        number2=Integer.parseInt(b);
        
        if(number1>number2)
            showMessageDialog(null,"Number 1 is bigger");
        else
            showMessageDialog(null,"Number 2 is bigger");
    }
}
