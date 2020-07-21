/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.assignment.pkg2;
import java.util.*;
/**
 *
 * @author Nahid Aslam 12
 */
public class creditLimitCalculator {
    public static void main(String args[])
    {
       
        int account,oldbalance,charges,credit,creditlimits,newBalance;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter account number:");
        account =  sc.nextInt();
        System.out.println("Enter Your Old balance:");
        oldbalance = sc.nextInt();
        System.out.println("Enter charges:");
        charges= sc.nextInt();
        System.out.println("Enter credits:");
        credit = sc.nextInt();
         System.out.println("Enter Credit Limit:");
        creditlimits = sc.nextInt();
        
        newBalance = oldbalance + charges - credit;
       
        if(newBalance<creditlimits)          
        System.out.println("Credit Limit Exceed");
        else {         
         System.out.println("Credit Report");
        
        }
         System.out.println("New Balance :"+newBalance);
    }
}
