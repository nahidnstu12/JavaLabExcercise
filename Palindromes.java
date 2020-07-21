package javaLab;
import java.util.Scanner;
public class Palindromes {
	private static Scanner input;
	public static void main(String args[]) {
		input = new Scanner(System.in);
		int n;
		while(true) {
			System.out.print("Enter a value of 5 digit: ");
			n = input.nextInt();
			if(n<100000 && n>9999) {
				int arr[] = new int[5];
				int i,j;
				for(i=10000,j=0;i>0;i=i/10,j++) {
					arr[j]=n/i;
					n=n%10;
				}
				if(arr[0]==arr[4] && arr[1]==arr[3]) {
					System.out.println("It's a palindromes");
				}
				else {
					System.out.println("It's not a palindromes");
				}
			}
			else {
				System.out.println("Error...!! Please enter e new value.");
			}
		}
	}
}
