/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day5;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Day5 {


    public static void main(String[] args) {
        String a;
        a=showInputDialog("Enter 1st number:");
        int number1;
        number1=Integer.parseInt(a);
        
        a=showInputDialog("Enter 2nd number:");
        int number2;
        number2=Integer.parseInt(a);
        
        showMessageDialog(null,"The sum of two numbers is"+(number1+number2));
    }
    
}
