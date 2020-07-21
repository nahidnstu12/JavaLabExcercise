package javaLab;
import java.util.Scanner;
public class BinaryToDecimal {
	private static Scanner input;
	public static void main(String args[]) {
		input = new Scanner(System.in);
		int n,x,y=1,total=0;
		System.out.print("Enter the binary num: ");
		n = input.nextInt();
		
		while(n>0) {
			x = n%10;
			n = n/10;
			total =total+(x*y);
			y=y*2;
		}
		
		System.out.println("Decimal value is: "+total);
	}
}
