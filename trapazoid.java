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
public class trapazoid extends Quadrilateral {
    double height;
   trapazoid (double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4) 
   {
       super(x1,y1,x2,y2,x3,y3,x4,y4);
   }
   double getHeight()
   {
       if (getp1().getY()== getp2().getY())
       return Math.abs(getp2().getY()-getp3().getY());
       else
           return Math.abs(getp1().getY()-getp2().getY());
   }
  
   double sumoftwosides()
   {
      if (getp1().getY()==getp2().getY())
       return Math.abs(getp1().getX()-getp2().getX())+
                Math.abs(getp3().getX()-getp4().getX());
       else
           return Math.abs(getp2().getX()-getp3().getX())+
                    Math.abs(getp4().getX()-getp1().getX()); 
   }
    double getArea()
   {
     return sumoftwosides()* getHeight()/2; 
   }
   public String toString()
   {
       return "\nCoordinates of Trapazoid are:\n"+printCoor()+"\nHeight is: "+
               getHeight()+"\nArea is: "+getArea();
   }
}
class parallelgram extends trapazoid
{
   parallelgram (double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4) 
   {
       super(x1,y1,x2,y2,x3,y3,x4,y4);
   }
   double getWeight()
   {
       if (getp1().getY()== getp2().getY())
       return Math.abs(getp1().getX()-getp2().getX());
       else
           return Math.abs(getp2().getX()-getp3().getX());
   }
   public String toString()
   {
       return "\nCoordinates of parallelgram are:\n"+printCoor()+"\nHeight is: "+
               getHeight()+"\nWeight is: "+  getWeight()+"\nArea is: "+getArea();
             
   }
}
class Rectangle extends parallelgram
{
   Rectangle (double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4) 
   {
       super(x1,y1,x2,y2,x3,y3,x4,y4);
   }
   public String toString()
   {
       return "\nCoordinates of Rectangle are:\n"+printCoor()+"\nHeight is: "+
               getHeight()+"\nWeight is: "+  getWeight()+"\nArea is: "+getArea();
             
   }
   
}
class Square extends parallelgram
{
   Square (double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4) 
   {
       super(x1,y1,x2,y2,x3,y3,x4,y4);
   }
   public String toString()
   {
       return "\nCoordinates of Square are:\n"+printCoor()+"\nHeight is: "+
               getHeight()+"\nWeight is: "+  getWeight()+"\nArea is: "+getArea();
             
   }
   
}
