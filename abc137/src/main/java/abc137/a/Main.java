package abc137.a;

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
        Integer A = scan.nextInt();
        Integer B = scan.nextInt();
        int plus = A + B;
        int minus = A - B;
        int multi = A * B;
        int max = -999;
        if(max < plus)
            max = plus;
        if (max < minus)
            max = minus;
        if(max < multi)
            max = multi;
        os.println(max);
    }
}