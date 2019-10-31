package abc144.b;

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
        int N = scan.nextInt();

        for(int i = 1; i <= 9; i++) {
            if(N % i == 0) {
                int j = N / i;
                if(1 <= j && j <= 9) {
                    os.println("Yes");
                    return;
                }
            }
        }

        os.println("No");

    }
}