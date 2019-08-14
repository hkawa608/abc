package abc088.b;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        Integer a[] = new Integer[N];
        int alice = 0;
        int bob = 0;

        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }

        Arrays.sort(a, Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            if(i % 2 == 0)
                alice += a[i];
            else
                bob += a[i];
        }

        os.println(alice - bob);
    }
}