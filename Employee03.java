package javaLab;

class Data1{
	String firstName;
	String lastName;
	double salary;
	Data1(String fn, String ln, double sal){
		firstName = fn;
		lastName = ln;
		if(sal<0)
			salary = 0;
		else
			salary = sal;
	}
	
	void setFirstname(String fn) {
		firstName = fn;
	}
	String getFirstname() {
		return firstName;
	}
	
	void setLastname(String ln) {
		lastName = ln;
	}
	String getLastname() {
		return lastName;
	}
	
	void setSalary(double sal) {
		if(sal<0)
			salary = 0;
		else
			salary = sal;
	}
	double getSalary() {
		return salary;
	}
}
public class Employee03 {
	public static void main(String args[]) {
		Data1 ob1 = new Data1("Ashik","Rahman",50000);
		Data1 ob2 = new Data1("Forhad","Komar",10000);
		
		System.out.println(ob1.getSalary()*12);
		System.out.println(ob2.getSalary()*12);
	}
}
