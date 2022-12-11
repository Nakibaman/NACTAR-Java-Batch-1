/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day5;

import static javax.swing.JOptionPane.showInputDialog;

/**
 *
 * @author nakibamanturzo
 */
public class Day5Task2 {
    public static void main(String[] args) {
        int choice;
        String a;
        a=showInputDialog("Enter how many numbers you want to input -");
        choice=Integer.parseInt(a);
        int i;
        a="";
        for(i=1;i<=choice;i=i+5)
            a=a+i+" ";
            
        showMessageDialog(null,a);
    }
}
