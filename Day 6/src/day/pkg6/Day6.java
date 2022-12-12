/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day.pkg6;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author nakibamanturzo
 */
public class Day6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        String a;
        a=showInputDialog("Enter the starting point-");
        choice=Integer.parseInt(a);
        int i;
        a="";
        for(i=choice;i>=-3;i=i-4)
            a=a+i+" ";
        System.out.println(i);
        showMessageDialog(null,a);
    }
    
}
