package abc138.a;

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
        int a = scan.nextInt();
        String s = scan.next();
        if(a >= 3200)
            os.println(s);
        else
            os.println("red");
    }
}