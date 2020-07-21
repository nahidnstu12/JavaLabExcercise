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

public class decrypt {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int number;
        int d1,d2,d3,d4,decryptnumb,res;
        System.out.println("Enter a four digit number: ");
        //number = Integer.parseInt(JOptionPane.showInputDialog());
       number = sc.nextInt();
        d1= number/1000;
        d2 = number%1000/100;
        d3 = number %100/10;
        d4 = number%10;
        decryptnumb = d1*10 + d2+d3*1000+d4*100;
       // if()
        d1 = (decryptnumb/1000)+3;
        d2 = (decryptnumb%1000/100+3);
        d3 = (decryptnumb%100/10+3);
        d4 = (decryptnumb%10+3);
        res= d1*1000+d2*100+d3*10+d4;
        //decryptnumb = d1*10 + d2+d3*1000+d4*100;
        
        System.out.println(res);
    }
}
