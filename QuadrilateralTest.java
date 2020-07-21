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
public class QuadrilateralTest {
    public static void main(String args[])
    {
        //Quadrilateral q1 = new Quadrilateral(1.1,1.2,6.6,2.8,6.2,9.9,2.2,7.4);
         //System.out.println(q1.toString());
        Quadrilateral t1 = new trapazoid(0.0,0.0,10.0,0.0,8.0,5.0,3.3,5.0);   
        System.out.println(t1.toString());
        
        Quadrilateral p1 = new parallelgram (5.0,5.0,11.0,5.0,12.0,20.0,6,20);
        System.out.println(p1.toString());
        
        Quadrilateral r1 = new Rectangle(17,14,30,14,30,28,17,28);
        System.out.println(r1.toString());
        
        Quadrilateral s1 = new Square(4,0,8,0,8,4,4,4);
        System.out.println(s1.toString());
       
    }
}
