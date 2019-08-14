package abc081.b;

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
        long A[] = new long[N];
        for(int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }

        int answer = 0;
        while(true){
            for(int i = 0; i < N; i++) {
                if(A[i] % 2 == 1){
                    os.println(answer);
                    return;
                }
                else {
                    A[i] = A[i] / 2;
                }
            }
            answer++;
        }
    }
}