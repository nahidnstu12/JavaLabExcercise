package javaLab;
import java.util.Scanner;
public class Encrypt10 {
	private static Scanner input;
	public static void main(String args[]) {
		input = new Scanner(System.in);
		int x,i=3,temp;
		int arr[] = new int[4];
		System.out.print("Enter the 4 digit num: ");
		x = input.nextInt();
		while(x>0) {
			arr[i]=x%10;
			x=x/10;
			i--;
		}
		for(int j=0; j<4; j++) {
			arr[j]=(arr[j]+7)%10;
		}
		for(int j=0;j<2;j++) {
			temp = arr[j];
			arr[j]=arr[j+2];
			arr[j+2]=temp;
		}
		for(int z:arr) {
			System.out.print(z);
		}
		
	}
}
