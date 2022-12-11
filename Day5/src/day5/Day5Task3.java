/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day5;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author nakibamanturzo
 */
public class Day5Task3 {
    public static void main(String[] args) {
        int choice;
        String a;
        a=showInputDialog("Enter how many numbers you want to input -");
        choice=Integer.parseInt(a);
        int i;
        int numbers[]=new int[choice];
        int sum;
        sum=0;
        for(i=1;i<=choice;i=i+1)
        {
            a=showInputDialog("Enter a number:");
            numbers[i-1]=Integer.parseInt(a);
            sum=sum+numbers[i-1];
        }
        
        showMessageDialog(null,"Sum of all the numbers is -"+sum);
    }
}
