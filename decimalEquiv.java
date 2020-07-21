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
import java.util.*;
public class decimalEquiv {
    public static void main(String args[])
    {
         Scanner sc = new Scanner (System.in);
         System.out.print("Enter a binary number: ");
         String n = sc.nextLine();
         System.out.print("Equivalent decimal number: ");
         System.out.println(Integer.parseInt(n,2));
         
    }
}
