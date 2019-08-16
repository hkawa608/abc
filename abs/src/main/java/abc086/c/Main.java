package abc086.c;

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
        int N = scan.nextInt();
//        int t[] = new int[N];
//        int x[] = new int[N];
//        int y[] = new int[N];
        int prevT = 0;
        int prevX = 0;
        int prevY = 0;

        for(int i = 0; i < N; i++) {
            int nowT = scan.nextInt();
            int nowX = scan.nextInt();
            int nowY = scan.nextInt();
            int t = nowT - prevT;
            int x = nowX - prevX;
            int y = nowY - prevY;
            if((t + x + y) % 2 == 0 && (t + x + y) / 2 >= x + y) {
                prevT = nowT;
                prevX = nowX;
                prevY = nowY;
                continue;
            }
            else {
                os.println("No");
                return;
            }
        }
        os.println("Yes");
    }
}