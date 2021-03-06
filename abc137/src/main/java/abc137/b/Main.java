package abc137.b;

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
        Integer K = scan.nextInt();
        Integer X = scan.nextInt();

        for(int i = X-K+1 ; i < X+K ; i++)
            os.print(i + " ");

        os.println();
    }
}