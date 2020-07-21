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
public class perfect {
    public static void main(String args[])
    {
        String output ="";
        for(int number = 2;number<=1000;number++)
        {
            String res =isPerfect(number);
        
        if(res!="0")
        {
            output+="\n"+number+" is perfect.\n\tFactors: "+res;
        }
       
        }
         System.out.println(output);
    }
    public static String isPerfect(int val)
    {
       int f =1;
       String fs ="1 ";
       for(int t=2;t<=val/2;t++)
       {
           if(val % t==0)
           {
               f += t;
               fs += t + " ";
           }
       }
       if(f == val)
           return fs;
       
       return "0";
    }
}
