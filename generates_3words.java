
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nahid Aslam 12
 */
public class generates_3words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 length String: ");
        String s = sc.nextLine();
        String temp ="";
        int m=0;
        for(int i =0;i<=4;i++)
        {
            for(int k=0;k<=4;k++)
            {
                if(i==k)continue;
             for(int j=0;j<=4;j++)
            {
                if(i==j||j==k)continue;
                temp=String.valueOf(s.charAt(i))+s.charAt(k)+s.charAt(j);
               System.out.println(temp);
            }   
            }
        }
         //System.out.println(m);
        
    }
}
