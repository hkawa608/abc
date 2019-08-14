package abc132.a;

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
        String testString = scan.next();
        Character one = testString.charAt(0);
        Character two = testString.charAt(1);
        Character three = testString.charAt(2);
        Character four = testString.charAt(3);
        if (one.equals(two) && three.equals(four) && !one.equals(three) && !one.equals(four)) {
            os.println("Yes");
        }
        else if (one.equals(three) && two.equals(four) && !one.equals(two) && !one.equals(four)) {
            os.println("Yes");
        }
        else if (one.equals(four) && two.equals(three) && !one.equals(two) && !one.equals(three)) {
            os.println("Yes");
        }
        else {
            os.println("No");
        }
    }
}