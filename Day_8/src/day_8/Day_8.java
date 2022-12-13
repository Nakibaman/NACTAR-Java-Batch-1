/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day_8;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author nakibamanturzo
 */
public class Day_8 {

    /**
     * @param args the command line arguments
     */
    public int ages[];
    public void calculate_age() {
        String message;
        message="";
        String report;
        report="";
        int c_old,c_mid,c_young,c_teen,c_kid;
        c_kid=0;
        c_teen=0;
        c_young=0;
        c_mid=0;
        c_old=0;
        for(int age:ages)
        {
        if(age>40)
        {
            message=message+"Age "+age+" is an Old Person\n";
            c_old++;
        }
        else if(age>30)
        {
            message=message+"Age "+age+" is a Middle Aged Person\n";
            c_mid++;
        }
        else if(age>20)
        {
            message=message+"Age "+age+" is a Young Person\n";
            c_young++;
        }
        else if(age>10)
        {
            message=message+"Age "+age+" is a Teen\n";
            c_teen++;
        }
        else
        {
            message=message+"Age "+age+" is a Kid\n";
            c_kid++;
        }
        }
        showMessageDialog(null,message);
        
        report=report+"Total number of Old Person is "+c_old+"\n";
        report=report+"Total number of Middle Age Person is "+c_mid+"\n";
        report=report+"Total number of Young People is "+c_young+"\n";
        report=report+"Total number of Teen is "+c_teen+"\n";
        report=report+"Total number of kids is "+c_kid+"\n";
        showMessageDialog(null,report);
        
        
        
    }
    
}

