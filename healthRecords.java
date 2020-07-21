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
import java.time.LocalDate;
import java.time.*;
//import java.text.DecimalFormat;
import java.util.*;

public class healthRecords {
    private String first;
    private String last;
    private int birthday;
    private int birthmonth;
    private int birthyear;
    private int age;
    private String gender;
    private double height;
    private double weight;
    
    public healthRecords(String f,String l,String g,int d,int m,int y,double h,double w )
    {
       first = f;
       last = l;
       birthday = d;
       birthmonth = m;
       birthyear = y;
       
       gender = g;
       height = h;
       weight =w;
       
       
    }
    public void setName(String f,String l)
    {
       first = f;
       last =l;
    }
    public String getName()
    {
        return first+" "+last;
    }
    public void setDOB(int day,int month,int year)
    {
        birthday = day;
        birthmonth = month;
        birthyear = year;
    }
    public void setGender(String g)
    {
      gender = g;  
    }
    public void setHeight(double g)
    {
      height = g;  
    }
    public void setWeight(double g)
    {
      weight = g;  
    }
    public int getCurrentAge()
    {
        LocalDate Birthday = LocalDate.of(birthyear, Month.of(birthmonth),birthday);
        LocalDate today = LocalDate.now();
        Period period = Period.between(Birthday,today);
        return period.getYears();
    }
    public double getCurrentBMI()
    {
        if(height > 3)
        {
            height = height/100;
            setHeight(height);
        }
        double bmi = weight/(height * height);
        return bmi;
    }
    public int getMaxHeartRate()
    {
        int maxheartrate = 220 - getCurrentAge();
        return maxheartrate;
    }
    public int getTargetHeartRate()
    {
        double targetheart = getMaxHeartRate() * .75;
        int a = (int) Math.round(targetheart);
        return a;
    }
    
}

class healthProfile
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in); 
       System.out.print("Enter your first name is:");
       String fn = sc.nextLine();
       System.out.print("Enter your first name is:");
       String ln = sc.nextLine();
       System.out.print("Enter your gender is:");       
       String gender = sc.nextLine();
       System.out.print("Enter your date of birth in numbers..\n");
       System.out.print("Enter your day of your birthday is:"); 
       int d = sc.nextInt();
       System.out.print("Enter your month of your birthday is:"); 
       int m = sc.nextInt();
       System.out.print("Enter your year of your birthday is:"); 
       int y = sc.nextInt();
       System.out.print("Enter your height is(m):"); 
       double h = sc.nextDouble();
       System.out.print("Enter your weight is(kg):"); 
       double w = sc.nextDouble();
       healthRecords p1 = new healthRecords(fn,ln,gender,d,m,y,h,w);
       System.out.println("\n\n");
       System.out.println("\tCalculate for "+p1.getName());
       System.out.println("Current age is: "+p1. getCurrentAge());
       System.out.printf("Current BMI is: %.2f\n",p1. getCurrentBMI());
       System.out.printf("Max heart rate is: %d \n",p1.getMaxHeartRate());
       System.out.printf("Terget heart rate is: %d \n\n",p1.getTargetHeartRate());
       
    }
}

