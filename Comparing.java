/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nahid Aslam 12
 */
import java.util.*;
public class Comparing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        System.out.printf("S1 Compare to(s2) %d \n",s1.compareTo(s2));
         System.out.printf("S2 Compare to(s1) %d \n",s2.compareTo(s1));     
    }
 
}
