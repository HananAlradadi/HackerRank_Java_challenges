 import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int size = in.nextInt();
        for(int i = 0 ; i < size ; i++){
            numbers.add(in.nextInt()) ;
        }
        size = in.nextInt();
        for(int i = 0 ; i < size ; i++){
            String op = in.next();
            if(op.equals("Insert")){
             numbers.add(in.nextInt(),in.nextInt()) ;
            }
            else{
               numbers.remove(in.nextInt()); 
            }
        }
        for(int i = 0 ; i < numbers.size() ; i++) {
            System.out.print(numbers.get(i)+ " ") ;
        }

    }
}

