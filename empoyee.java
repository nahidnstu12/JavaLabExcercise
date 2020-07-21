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
public class empoyee {
    private String firstName;
    private String lastName;
    private double salary;
    public empoyee(String fn,String ln,double s)
    {
       firstName = fn;
       lastName = ln;
       salary = s;
    }
    public void display()
    {
       System.out.println("Employee's name is "+firstName+" "+lastName+"\nYearly Salary is: "+yearlySalary());
       
    }
    public double yearlySalary()
    {
        return 12*salary;
    }
    public double raise()
    {
        return yearlySalary()+(.1*salary);
    }
}

class tstemployee
{
    public static void main(String args[]){
    empoyee e1 = new empoyee("Nahid","Aslam",200);
    e1.display();
    System.out.println(e1.raise());
    }
}