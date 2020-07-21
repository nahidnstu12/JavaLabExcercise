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
public class ComplexNumber {
    private double real;
    private double imaginary;
    
    public ComplexNumber()
    {
       real = 0.0;
       imaginary =0.0;
        
    }
     public ComplexNumber(double r,double i)
    {
       real = r;
       imaginary =i;
        
    }
     
     public ComplexNumber Add(ComplexNumber right)
     {
         return new ComplexNumber(real+right.real,imaginary+right.imaginary);
     }
      public ComplexNumber Subtract(ComplexNumber right)
     {
         return new ComplexNumber(real-right.real,imaginary-right.imaginary);
     }
      public String toString()
      {
         return "("+real+","+imaginary+")"; 
      }
}
class Complex
{
    public static void main(String args[])
    {
        ComplexNumber a,b;
        a= new ComplexNumber(19.5,7.7);
        b = new ComplexNumber(1.2,3.3);
        String res = "a = "+a.toString();
        res+="\nb = "+b.toString();
        res+="\na + b = "+a.Add(b).toString();
        res+="\na - b = "+a.Subtract(b).toString();
        
        System.out.println(res);
    }
}