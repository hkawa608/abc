package abc143.a;

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
        int A = scan.nextInt();
        int B = scan.nextInt();

        if(A <= B*2)
            os.println(0);
        else
            os.println(A-B*2);
    }
}