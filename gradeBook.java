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
public class gradeBook {
    private String courseName;
    private String instructor;
    public gradeBook(String name,String ins)
    {
        courseName = name;
        instructor = ins;
    }
    public void setCourseName(String name)
    {
        courseName = name;
    }
    public String getCourseName()
    {
        return courseName;
    }
    public void setteacName(String name)
    {
        instructor = name;
    }
    public String getteachName()
    {
        return instructor;
    }
    public void classAverage()
    {
        Scanner sc = new Scanner (System.in);
        int total = 0;
        int counter = 0;
        int grd;
        double average;
        System.out.print("Enter grade or -1 to quit : ");
        grd = sc.nextInt();
        while(grd!= -1)
        {
            total = total + grd;
            counter+=1;
            System.out.print("Enter grade or -1 to quit : ");
            grd = sc.nextInt();
        }
        if(counter != 0)
        {
            average =  (double)total/counter;
            System.out.println("total of the "+counter+" grades entered is "+total);
            System.out.printf("Class average is %.2f\n",average);
            
        }
        else
        {
            System.out.println("No grades were entered");
        }
    }
    public void dispaly()
    { 
        System.out.println("Welcome to gradebook for "+getCourseName()+"\nCourse Instructor's name "+getteachName());
        
    }
}
class grdbookTest
{
    public static void main(String args[])
    {
        gradeBook gb1 = new gradeBook("\"CS01 Introduction java program\"","\"S.A. Pathan\"");
        gradeBook gb2 = new gradeBook("\"CS02 Introduction Data Structure\"","\"Hasnat Ryiaz\"");
        gb1.dispaly();
        //gb2.dispaly();
        gb1.classAverage();
        //System.out.println("Grade Book course name is "+gb1.getCourseName());
       //System.out.println("Grade Book course name is "+gb2.getCourseName());
    }
}
