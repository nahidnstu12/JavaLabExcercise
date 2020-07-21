package javaLab;

class Com{
	float real;
	float imagine;
	Com(float r, float im){
		real=r;
		imagine=im;
	}
	void add(Com ob) {
		float x=real+ob.real;
		float y=imagine+ob.imagine;
		if(y>0) {
			System.out.println(x+"+"+y+"i");
		}
		else
			System.out.println(x+""+y+"i");
	}
	
	void sub(Com ob) {
		float x=real-ob.real;
		float y=imagine-ob.imagine;
		if(y>0) {
			System.out.println(x+"+"+y+"i");
		}
		else
			System.out.println(x+""+y+"i");
	}
}

public class ComplexNum13 {
	public static void main(String args[]) {
		Com ob1= new Com(1,2);
		Com ob2 = new Com(2,3);
		ob1.add(ob2);
		ob1.sub(ob2);
	}
}
