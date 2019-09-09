package abc040.c;

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
        int a[] = new int[N];
        int c[] = new int[N];
        Arrays.fill(c, 0);
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }

        c[0] = 0;
        c[1] = Math.abs(a[1] - a[0]);
        for(int i = 1; i < N-1; i++) {
            c[i+1] = Math.min(c[i] + Math.abs(a[i+1] - a[i]), c[i-1] + Math.abs(a[i+1] - a[i-1]));
        }

        os.println(c[N-1]);

    }
}