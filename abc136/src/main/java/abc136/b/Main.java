package abc136.b;

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
        Integer N = scan.nextInt();
        Integer answer = 0;
        if(N / 100000 > 0) {
            answer = 90909;
        } else if(N / 10000 > 0) {
            answer = N - 10000 + 1 + 909;
        } else if(N / 1000 > 0) {
            answer = 909;
        } else if(N / 100 > 0) {
            answer = N - 100 + 1 + 9;
        } else if(N / 10 > 0) {
            answer = 9;
        } else if(N / 1 > 0) {
            answer = N;
        }
        os.println(answer);
    }
}