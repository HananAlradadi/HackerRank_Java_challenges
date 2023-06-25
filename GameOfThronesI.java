import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
          
        int count = 0;
        int count1 = 0 ;
        if (s.length() % 2 == 0){
        for(char h = 'a' ; h <= 'z' ; h++){
            count = 0 ;
            for (int i = 0; i < s.length(); i++) {
                char v = s.charAt(i);
               
                    if (h == s.charAt(i)) {
                        count++;
                    }

              

            }  if (count % 2 == 1) {
                    return  "NO" ;
                }
         
        }
        } 
        else {
              for(char h = 'a' ; h <='z' ; h++){
            for (int i = 0; i < s.length (); i++) {
                char v = s.charAt(i);
                  count = 0;
 
                    if (v == h) {
                        count++;
                       
                    }
         
                 
                  } 
                             if (count % 2 == 1 ){
                      count1++ ;
                    
            }
            
            
            if (count1> 1){
                return  "NO" ;
                 
                }  

        }
        }



       return "YES";

    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
