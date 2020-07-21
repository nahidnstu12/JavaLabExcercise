
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
public class caseing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter upper case String:");
        s1 = sc.nextLine();
        System.out.println(s1.toLowerCase());
         System.out.println("Enter lower case String:");
        s2 = sc.nextLine();
        System.out.println(s2.toUpperCase());
    }
}
