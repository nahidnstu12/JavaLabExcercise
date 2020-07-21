package javaLab;

import java.util.ArrayList;

public class Sales06 {
	private static ArrayList<Double> value;

	public static void main(String args[]) {
		value = new ArrayList<>();
		double sellAmount=0;
		value.add(239.99);
		value.add(129.75);
		value.add(99.95);
		value.add(350.89);
		
		for(int i=0; i<value.size(); i++) {
			sellAmount=sellAmount+value.get(i);
		}
		
		double earning = 200+(sellAmount/100)*9;
		
		System.out.println("Total earning: "+earning);
	}
}
