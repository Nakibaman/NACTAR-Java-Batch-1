/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day.pkg6;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author nakibamanturzo
 */
public class Day_6_Task_2 {
    public static void main(String[] args) {
        int choice;
        String a;
        a=showInputDialog("Enter how many numbers you want to input -");
        choice=Integer.parseInt(a);
        int i;
        int numbers[]=new int[choice];
        int sum;
        sum=0;
        for(i=0;i<=choice;i=i+1)
        {
            a=showInputDialog("Enter a number:");
            numbers[i]=Integer.parseInt(a);
            sum=sum+numbers[i];
        }
        
        showMessageDialog(null,"Sum of all the numbers is -"+sum);
    }
}
