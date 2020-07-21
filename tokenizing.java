
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
public class tokenizing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
       // boy boy boy bio. leo kio kero leo
        System.out.println("Enter String:");
        s1 = sc.nextLine();
        String [] s3 = s1.split(" ");
        
        System.out.println("The tokens are: ");
        
        for(String s4:s3)
        {
            if(s4.charAt(0)=='b')
            System.out.println(s4);
        }
    }
}
