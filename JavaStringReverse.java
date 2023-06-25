import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
         
         int count1 = 0;
              String f = "" ;
        if (s.length() % 2 == 0) {
            for (int i = 0; i < s.length(); i++) {
                char v = s.charAt(i);
                int count = 0;
                for (int j = 0; j < s.length() ; j++) {
                    if (v == s.charAt(j)) {
                        count++;
                    }

                }
                if (count % 2 == 1) {
                 System.out.print( "No" ) ;
                 break ;
                }
                 if(i == s.length()-1){
                      System.out.print( "Yes" ) ;
                 }

            }
             } else {
            for (int i = 0; i < s.length() ; i++) {

                char v = s.charAt(i);
                int count = 0;
                 if(v != '0'){
                for (int j = 0; j < s.length(); j++) {
                    if (v == s.charAt(j) ) {
                        count++;
                    }
                }
                
                  if (count % 2 == 1  ){
                    s = s.replace(s.charAt(i), '0') ;
                      count1++ ;
                  }
                if (count1 > 1 ) {
                  System.out.print( "No" ) ;
                 break ;
                }
                
                 }
                 if(i ==  s.length()-1){
                      System.out.print( "Yes" ) ;
                 }

                 }
        }


        }
            
            
            
        






     

     
        
    }




