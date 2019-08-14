package abc085.c;

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
        int Y = scan.nextInt();
        for(int i = 0; i <= N; i++) {
            for(int j = 0; j <= N; j++) {
                if((N - i - j) >= 0 && 10000 * i + 5000 * j + 1000 * (N - i - j) == Y) {
                    os.println(i + " " + j + " " + (N - i - j));
                    return;
                }
            }
        }
        os.println("-1 -1 -1");
    }
}