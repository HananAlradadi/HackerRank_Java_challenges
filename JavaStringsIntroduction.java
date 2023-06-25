import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length() + B.length() ;
        System.out.println(sum) ;
         int i = A.compareTo(B);
        if(i>0){
            System.out.println("Yes") ;
        }
        else {
            System.out.println("No") ;
        } 
        String C = A.substring(0, 1).toUpperCase() ;
        String G = B.substring(0,1).toUpperCase() ;
        A = A.substring(1) ;
        B = B.substring(1) ;
       
        String Line3 = C + A + " " + G + B ;
        System.out.println(Line3) ;
        
        
    }
}



