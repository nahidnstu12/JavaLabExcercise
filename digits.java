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
import java.math.*;
public class digits {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
       int number;
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
       System.out.println("Printed number with 3 spaces.");  
       display(number);
      }
       }
        //display(123);
    }
    public static int qut(int a,int b)
    {
        return a/b;
    }
     public static int mod(int a,int b)
    {
        return a%b;
    }
    static void display(int num)
     {
         int div =1;
         int digit;
         String res="";
         for(int i=1;i<num;i*=10)        
             div=i;
         //System.out.println(div);}
         //System.out.println("outside "+div);
            while(div>=1)
            {
               // digit = qut(num,div);
                digit = num/div;
                res += digit+"   ";
                // System.out.println(digit);
               // num = mod(num,div);
               num = num%div;
               div = div/10;
                //div =qut(div,10);
            }
            
         
         System.out.println(res);
     }
}

