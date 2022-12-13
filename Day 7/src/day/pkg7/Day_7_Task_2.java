/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day.pkg7;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author nakibamanturzo
 */
public class Day_7_Task_2 {
    public static void main(String[] args) {
        String input;
        input=showInputDialog("Enter a number");
        int number;
        number=Integer.parseInt(input);
        
        if(number>25)
        {
            if(number<50)
            {
                if(number%2==0)
                    showMessageDialog(null,"Congratulations");
                else
                    showMessageDialog(null,"Sorry Even");
            }
            else
                showMessageDialog(null,"Sorry 50");
        }
        else
            showMessageDialog(null,"Sorry 25");
        
    }
}
