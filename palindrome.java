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
public class palindrome {
    public static void main(String args[])
  {
      int number=0,digits = 0,d1,d2,d4,d5;
      String result;
      Scanner sc = new Scanner (System.in);
//      System.out.println("Enter a 5 digit number: ");
//      number = sc.nextInt();
      while(digits !=5)
      {
          System.out.println("Enter a 5 digit number: ");
      number = sc.nextInt();
          //System.out.println("Enter a 5 digit number: ");
          if(number<100000)
          {
              if(number>9999)
                  digits = 5;
              else
                  System.out.println("Error!!\nNumber must be 5 digits!");
              
          }
          else
               System.out.println("Error!!\nNumber must be 5 digits!");
      }
      d1 = number/10000;
      d2 = number %10000/1000;
      d4 = number %10000%1000%100/10;
      d5 =number %10000%1000%100%10;
    if(d1 == d5){
       // System.out.println("");
    if(d2==d4)
        //System.out.println(number +" is a palindrome");
        result = number + " is a palindrome";
    else
       // System.out.println(number +" is not a palindrome");
        result = number + " is not a palindrome";
    }
    else
        result  = number + " is not a palindrome";
    //System.out.println(number +" is not a palindrome");
  System.out.println(result);
  }
}
