/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.assignment.pkg2;

/**
 *
 * @author Nahid Aslam 12
 */
import java.awt.*;
import javax.swing.JOptionPane;
public class encrypt {
    public static void main(String args[])
    {
        int number;
        int d1,d2,d3,d4,encryptnumb;
        
        number = Integer.parseInt(JOptionPane.showInputDialog("Enter a four digit number: "));
        d1 = (number/1000+7)%10;
        d2 = (number%1000/100+7)%10;
        d3 = (number%100/10+7)%10;
        d4 = (number%10+7)%10;
        
        encryptnumb = d1*10 + d2+d3*1000+d4*100;
        JOptionPane.showMessageDialog(null,"Encrypted Number is "+encryptnumb,"Encrypt",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
