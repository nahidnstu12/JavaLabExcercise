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
class point
{
   private double x,y;
   point(double a,double b)
   {
       x=a;
       y=b;
   }
   double getX()
   {
       return x;
   }
   double getY()
   {
       return y;
   }
  public String toString()
   {
    return "( "+getX()+","+getY()+" )";   
   }
}

 class Quadrilateral {
    point p1,p2,p3,p4;
    Quadrilateral(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4)
    {
        p1=new point(x1,y1);
        p2=new point(x2,y2);
        p3=new point(x3,y3);
        p4=new point(x4,y4);
    }
    
  public point getp1()
    {
        return p1;
    }
    point getp2()
    {
        return p2;
    }
    point getp3()
    {
        return p3;
    }
    point getp4()
    {
        return p4;
    }
    public String printCoor()
    {
        return p1.toString()+" , "+p2.toString()+" , "+p3.toString()+" , "+p4.toString();
    }
     
}

