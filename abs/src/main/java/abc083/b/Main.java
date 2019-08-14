package abc083.b;

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
        int A = scan.nextInt();
        int B = scan.nextInt();
        int answer = 0;

        for(int i = 1; i <= N ; i++) {
            String temp = String.valueOf(i);
            int length = temp.length();
            char tempArray[] = temp.toCharArray();
            int sum = 0;
            for(int j = 0; j < length; j++) {
                sum += Integer.parseInt(String.valueOf(tempArray[j]));
            }
            if(A <= sum && sum <= B)
                answer += i;
        }

        os.println(answer);
    }
}
