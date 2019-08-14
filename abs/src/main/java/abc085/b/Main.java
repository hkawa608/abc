package abc085.b;

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
        int answer = 0;
        Integer d[] = new Integer[N];
        for (int i = 0; i < N; i++) {
            d[i] = scan.nextInt();
        }
        Arrays.sort(d, Collections.reverseOrder());

        int prevMaxd = 1000;
        for (int i = 0; i < N; i++) {
            if(prevMaxd > d[i]) {
                prevMaxd = d[i];
                answer++;
            }
        }

        os.println(answer);
    }
}