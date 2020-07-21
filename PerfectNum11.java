package javaLab;

import java.util.ArrayList;

public class PerfectNum11 {
	private static ArrayList<Integer>values;
	public static void main(String args[]) {
		values = new ArrayList<>();
		
		for(int i=1; i<1001; i++) {
		    int total=0;
			for(int j=1; j<i; j++) {
				if(i%j==0) {
					values.add(j);
					total=total+j;
				}
			}
		
			if(total==i) {
				for(int z=0; z<values.size(); z++) {
					if(z<values.size()-1){
					    System.out.print(values.get(z)+"+");
					}
					else
					    System.out.print(values.get(z));
				}
				System.out.println("=" +total);
			}
			values.clear();
		}
	}
}
