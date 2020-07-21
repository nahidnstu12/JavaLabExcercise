package javaLab;
import java.util.Scanner;
public class LargestNo07 {
	private static Scanner sc;
	public static void main(String args[]) {
		sc = new Scanner(System.in);
		int i,lvalue;
		int values[] = new int[10];
		System.out.println("Enter the 10 values:");
		for(i=0; i<10; i++) {
			values[i] = sc.nextInt();
		}
		lvalue = values[0];
		
		for(i=1; i<10; i++) {
			if(lvalue<values[i]) {
				lvalue=values[i];
			}
		}
		
		System.out.println("Largest value is: "+lvalue);
	}
}
