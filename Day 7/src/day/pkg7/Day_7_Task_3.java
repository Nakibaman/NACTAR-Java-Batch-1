/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day.pkg7;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author nakibamanturzo
 */
public class Day_7_Task_3 {
    public static void main(String[] args) {
        int ages[]={23,5,15,69,35,50,28,30,30,18,-1};
        String message;
        message="";
        for(int age:ages)
        {
        if(age>40)
            message=message+"Age "+age+" is an Old Person\n";
        else if(age>30)
            message=message+"Age "+age+" is a Middle Aged Person\n";
        else if(age>20)
            message=message+"Age "+age+" is a Young Person\n";
        else if(age>10)
            message=message+"Age "+age+" is a Teen\n";
        else
            message=message+"Age "+age+" is a Kid\n";
        }
        showMessageDialog(null,message);
    }
}
