import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in) ;
     
     int N = input.nextInt();
     if(N>=2 && N<=20){
     for(int i = 1 ; i <= 10 ; i++){
         
         System.out.printf("%d x %d = %d%n",N , i , (N*i));
     }
     }
     else
     System.out.println("Invalid input!");
        
    }
}
