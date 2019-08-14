package abc087.b;

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
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int X = scan.nextInt();

        int answer = 0;
        for(int i = 0; i <= A; i++) {
            for(int j = 0; j <= B; j++) {
                for(int k = 0; k <= C; k++) {
                    if(500 * i + 100 * j + 50 * k == X)
                        answer++;
                }
            }
        }
        os.println(answer);
    }
}