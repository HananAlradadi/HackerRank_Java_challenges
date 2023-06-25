import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        int cont = 0 ;
        for(int i = 0 ; i < S.length() ; i++){
            char k = S.charAt(i) ;
            int x = (int) k ;
            if(x>=65 && x<=122){
                cont++ ;
            }
        }
        if(cont==S.length()){
            System.out.print(S.substring(start , end)) ; 
        }
    }
}

