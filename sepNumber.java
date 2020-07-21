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
public class sepNumber {
   public static void main(String args[])
   {
      int number,d1,d2,d3,d4,d5;
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter 5 digited number:");
      while(sc.hasNext()){
      
      number = sc.nextInt();
      if(number<9999 || number>100000)
      {
         System.out.println("Invalid Input.Plese Enter 5 digited number only:"); 
         //number = sc.nextInt();
      }
      else if(number>9999 && number<100000)
      {
      d1 = number/10000;
      d2 = number %10000/1000;
      d3 = number%10000%1000/100;
      d4 = number %10000%1000%100/10;
      d5 =number %10000%1000%100%10;
       System.out.println("Printed number with 3 spaces.");
       System.out.println(d1+"   "+d2+"   "+d3+"   "+d4+"   "+d5);
   }
   }
   }
}
