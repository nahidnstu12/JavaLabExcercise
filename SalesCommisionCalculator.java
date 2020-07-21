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
public class SalesCommisionCalculator {
   public static void main(String args[])
  {
      double gross = 0.0d,earnings;
      int product = 0,numsold;
     
      Scanner sc = new Scanner(System.in);
      while(product<4)
      {
          product++;
         
         System.out.print("Enter a number of sold product #"+product+":");
          numsold = sc.nextInt();
          
          if(product == 1)
              gross+=numsold*239.99;
          else if(product == 2)
              gross+=numsold*129.75;
           else if(product == 3)
              gross+=numsold*99.95;
           else if(product == 4)
              gross+=numsold*350.89;
      }
      earnings = 0.09*gross+200;
       System.out.printf("Earning this week: %.2f\n",earnings);
      
  }
}
 

