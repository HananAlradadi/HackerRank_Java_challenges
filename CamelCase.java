import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    // Complete the camelcase function below.
    static int camelcase(String s) {
         int count = 1 ;
         for(int i = 0 ; i < s.length() ; i++){
            char d = s.charAt(i) ;
             if(d >= 'A' && d <='Z'){
                 count++ ;
             }
         }

             return count ;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String read = input.nextLine();
        int f = camelcase(read) ;
       System.out.println(f ) ;

}
}
