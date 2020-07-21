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
public class rectangle {
    private  double height;
    private  double width;
    
    public rectangle(int h,int w)
    {
       if(h>0.0 && h<20.0)
        {
            height=h;
        }
        else
            throw new IllegalArgumentException("Height must be within 0.0 to 20.0");
     if(w>0.0 && w<20.0)
        {
           width=w;
        }
        else
            throw new IllegalArgumentException("Width must be within 0.0 to 20.0");
    
    }
    public rectangle()
    {
        height=1;
        width=1;
    }
    void setHeight(int h)
    {
        if(h>0.0 && h<20.0)
        {
            height=h;
        }
        else
            throw new IllegalArgumentException("Height must be within 0.0 to 20.0");
    }
     double getHeight()
    {
        return height;
    }
     void setWidth(int h)
    {
        if(h>0.0 && h<20.0)
        {
            width=h;
        }
        else
            throw new IllegalArgumentException("Width must be within 0.0 to 20.0\n");
    }
   double getWidth()
    {
        return width;
    }
    void calcPerimiter()
    {
       double p = 2*(getWidth()+getHeight());
      System.out.printf("Rectangle's perimiter is %.2f\n ",p);
    }
    void calcArea()
    {
        double p = (getWidth()*getHeight());
      System.out.printf("Rectangle's Area is %.2f \n",p);
    }
    void display()
    {
        
    }
}
class RC
{
    public static void main(String args[])
    {
        rectangle r1= new rectangle(12,12);
         r1.calcArea();
        r1.calcPerimiter();
       
        rectangle r3= new rectangle();
       r3.setHeight(11);
       r3.setWidth(11);
         r3.calcArea();
        r3.calcPerimiter();
         rectangle r2= new rectangle(15,21);
         r2.calcArea();
        r2.calcPerimiter();
        
    }
}
