package javaLab;
import java.util.*;
public class Problem01 {
	private static Scanner sc;

	public static void main(String args[]) {
		System.out.print("Give input: ");
		sc = new Scanner(System.in);
		int x = sc.nextInt();
		int k=1;
		
		for(int i=1; i<x;i=i*10) {
			k=i;
		}
		
		for(int i=k; i>0; i=i/10) {
			int y=x/i;
			System.out.print(y+"   ");
			x=x%i;
		}
	}
}
