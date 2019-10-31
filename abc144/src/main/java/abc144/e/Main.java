package abc144.e;

import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        long K = scan.nextLong();
        Integer A[] = new Integer[N];
        Integer F[] = new Integer[N];

        for(int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        for(int i = 0; i < N; i++) {
            F[i] = scan.nextInt();
        }

        for(int i = 0; i < K; i++) {
            Arrays.sort(A, Comparator.reverseOrder());
            if(A[0] > 0)
                A[0] = A[0]-1;
            else
                break;
        }
        Arrays.sort(A, Comparator.reverseOrder());
        Arrays.sort(F);

        long answer = 0;
        for(int i = 0; i < N; i++) {
            long temp = A[i] * F[i];
            if(temp > answer)
                answer = temp;
        }

        os.println(answer);

    }
}