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
public class SalesCommission {
public static void main(String args[])
  {
      double gross = 0.0d,earnings;
      int product = 0,numsold;
      String input;
      Scanner sc = new Scanner (System.in);
      while(product<4)
      {
          product++;
          //input = JOptionPane.showInputDialog("Enter number of sold product #"+product+":");
          //numsold = Integer.parseInt(input);
          System.out.println("Enter number of sold product #"+product+":");
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
      //String result = "Earning this week: "+earnings;
       System.out.printf("Total Sales \nEarning this week: %.2f ",earnings);
      //JOptionPane.showMessageDialog(null,result,"Sales",JOptionPane.INFORMATION_MESSAGE);
      //System.exit(0);
      
  }
}
    

