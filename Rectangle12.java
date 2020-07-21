package javaLab;

class Rec{
	double length=1;
	double width=1;
	void setLength(double ln){
		if(ln>0 && ln<=20) {
			length=ln;
		}
		else {
			System.out.println("Length out of bound, enter valid value.");
		}
	}
	double getLength() {
		return length;
	}
	void setWidth(double wd){
		if(wd>0 && wd<=20) {
			width=wd;
		}
		else {
			System.out.println("Width out of bound, enter valid value.");
		}
	}
	double getWidth() {
		return width;
	}
	
	double area() {
		return length*width;
	}
}
public class Rectangle12 {
	public static void main(String args[]) {
		Rec ob1 = new Rec();
		ob1.setLength(10);
		ob1.setWidth(10.5);  
		System.out.println("Area is: "+ob1.area());
	}
}
