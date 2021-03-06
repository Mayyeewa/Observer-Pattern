import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'maximumOccurringCharacter' function below.
     *
     * The function is expected to return a CHARACTER.
     * The function accepts STRING text as parameter.
     */

    public static char maximumOccurringCharacter(String text) {
         int count[] = new int[10000];
         int len = text.length();
            for (int i=0; i<len; i++)
                count[text.charAt(i)]++;
           
            int max=-1;
            char result = ' ';
            
            for (int i = 0; i < len; i++) {
	            if (max < count[text.charAt(i)]) {
	                max = count[text.charAt(i)];
	                result = text.charAt(i);
	            }
                
            }
            return result;
    }
    
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String text = bufferedReader.readLine();

        char result = Result.maximumOccurringCharacter(text);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
    
}
