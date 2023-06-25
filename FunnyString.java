import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the funnyString function below.
    static String funnyString(String s) {
int [] s1 = new int [s.length()];
     int [] s2 = new int [s.length()];
     int [] s3 = new int [s.length()-1];
     int [] s4 = new int [s.length()-1];
     int l = s.length()-1;
        for(int i = 0 ; i <s.length() ; i++){
            s1[i]=(int)s.charAt(i);
            s2[i] = (int)s.charAt(l--)  ;
            
            
            
               }
               for(int i = 0 ; i < s3.length ; i++){
                   s3[i] = Math.abs((s1[i]-s1[i+1]));
                   s4[i] = Math.abs((s2[i]-s2[i+1]));
                   
               }
               if(Arrays.equals(s3,s4)){
                   return "Funny";
               }
        return "Not Funny";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
