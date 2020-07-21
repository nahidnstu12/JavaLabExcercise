/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Nahid Aslam 12
 */
public class comparingPortion {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        if(s1.regionMatches(true,0, s2, 0, 5))
        {
            System.out.println("Same");
        }
        else
             System.out.println("not same");
     }
}
