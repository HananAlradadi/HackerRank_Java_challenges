import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(( n >= 0 ) && (n <= 100000)) ;
        int f = n % 10 ;
        int r = n / 10 ;
        int s = r % 10 ;
            r = r / 10 ;
        int t = r % 10 ;
           r = r / 10 ;
        int fo =r % 10 ;
           r = r / 10 ;
        int fi = r % 10 ;
            r = r / 10 ;
        int si = r % 10 ;
            r = r / 10 ;
        int sum = f + s + t + fo + fi + si ;
        System.out.println("The sum is " + sum ) ; 
        
        
        
        }
}
