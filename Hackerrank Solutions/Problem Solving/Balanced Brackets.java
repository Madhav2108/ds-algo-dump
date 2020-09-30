import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isBalanced function below.
    static String isBalanced(String str) {
        Stack<Character> s = new Stack<Character>();
        int flag = 1;
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(c=='[' || c=='(' || c=='{')
            {
                s.push(c);
            }
            else if(c==']' || c==')' || c=='}')
            {
                if(s.isEmpty())
                {
                    flag = 0;
                    break;
                }
                else if((c==']' && s.peek()=='[') || (c==')' && s.peek()=='(') || 
                (c=='}' && s.peek()=='{'))
                {
                    s.pop();
                }
                else 
                {
                    flag = 0;
                    break;
                }
            }
        }
        if(s.isEmpty() && flag==1)
         return "YES";
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
