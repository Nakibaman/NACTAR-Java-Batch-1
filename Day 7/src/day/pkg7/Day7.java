/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day.pkg7;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author nakibamanturzo
 */
public class Day7 {

    public static void main(String[] args) {
        
        String cars[]={"FERRARI","Jaguar","Ford","Tesla","Audi","Toyota","Honda"};
        
        String message;
        message="";
        
        for(String car:cars)
        {
            message=message+car+"\n";
        }
        showMessageDialog(null,message);
    }
    
}
