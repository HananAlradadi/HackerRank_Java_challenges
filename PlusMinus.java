import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
     int countp = 0 ;
     int countn =0 ;
     int countz = 0;
     for(int i = 0 ; i < arr.length ; i++ ){
         if(arr[i]<0){
             countn++;
         }
         else if (arr[i]>0){
             countp++ ;
         }
         else {
             countz++ ;
         }

     }
     double n = (double) countn / (double) arr.length  ;
     double p = (double ) countp / (double) arr.length ;
     double z = (double) countz / (double) arr.length ; 

     System.out.printf("%.6f\n%.6f\n%.6f",p,n,z) ;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
