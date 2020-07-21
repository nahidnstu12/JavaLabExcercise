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
public class creditLimit {
    public static void main(String args[])
    {
        String input,result,creditStatus;
        int account,oldbalance,charges,credit,creditlimits,newBalance;
        
        input = JOptionPane.showInputDialog("Enter account number:");
        account = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter Your balance:");
        oldbalance = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter charges:");
        charges = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter credits:");
        credit = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter Credit Limit:");
        creditlimits = Integer.parseInt(input);
        
        newBalance = oldbalance + charges - credit;
        
        result = "New Balance :"+newBalance;
        
        if(newBalance>creditlimits)
             creditStatus ="Credit Report";
        else
            creditStatus = "Credit Limit Exceed";
           
        JOptionPane.showMessageDialog(null,result,creditStatus,JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        
        
    }
}

