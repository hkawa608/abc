package abc006.c;

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
        int M = scan.nextInt();
        //老人2人は赤ちゃん1人と大人1人に分けられるので、老人が0人 or 1人の時のみ考えればよい。
        for(int i = 0 ; i <= N; i++) {
            if(-2*i == M-4*N) {
                os.println(i + " 0 " + (N-i));
                return;
            } else if(-2*i == M-4*N+1 && i < N) {
                os.println(i + " 1 " + (N-i-1));
                return;
            }
        }
        os.println("-1 -1 -1");
    }
}