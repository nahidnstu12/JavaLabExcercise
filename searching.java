
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
public class searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter String:");
        s1 = sc.nextLine();
        System.out.println("'c' is located at index "+s1.indexOf('c'));
    }
}
