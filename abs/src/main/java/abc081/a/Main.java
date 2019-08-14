package abc081.a;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        String input = scan.next();
        char arrayS[] = input.toCharArray();
        int answer = 0;
        for (int i = 0; i < 3 ; i++) {
            if(arrayS[i] == '1')
                answer++;
        }
        os.println(answer);
    }
}
