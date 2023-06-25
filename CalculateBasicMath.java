import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         
        Scanner input = new Scanner(System.in) ;
        int n1 = input.nextInt() ;
        int n2 = input.nextInt() ;
        int  s = n1 + n2 ;
         int  d = n1 - n2 ;
         int  p = n1 * n2 ;
         int q = n1 / n2 ;
        int  r = n1 % n2 ; 
        if((n1>=0)&&(n1<=1000)){
         if ((n2>=0)&&(n2<=1000))  
          
System.out.println("The sum, difference, product, quotient and remainder of " + n1 + " and " + n2 + " are " + s + ", "+ d + ", " + p + ", " + q + ", and " + r ) ; 
        }    
    }
}
