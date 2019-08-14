package abc136.a;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        Integer A = scan.nextInt();
        Integer B = scan.nextInt();
        Integer C = scan.nextInt();
        Integer answer = 0;
        if(A-B < C) {
            answer = C-A+B;
        }
        else {
            answer = 0;
        }
        os.println(answer);
    }
}