package javaLab;
import java.util.Scanner;
public class Decrypt10 {
	private static Scanner input;
	public static void main(String args[]) {
		input = new Scanner(System.in);
		int x,i=3,temp;
		int arr[]= new int[4];
		System.out.print("Enter the 4 digit value: ");
		x = input.nextInt();
		while(x>0) {
			arr[i]=x%10;
			x=x/10;
			i--;
		}
		for(int j=0; j<2; j++) {
			temp=arr[j];
			arr[j]=arr[j+2];
			arr[j+2]=temp;
		}
		
		for(int j=0; j<4; j++) {
			if(arr[j]>6 && arr[j]<10) {
				arr[j]=arr[j]-7;
			}
			else {
				arr[j]=arr[j]+3;
			}
		}
		
		for(int z:arr) {
			System.out.print(z);
		}
	}
}
