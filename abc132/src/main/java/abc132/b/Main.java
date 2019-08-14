package abc132.b;

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
        Integer numSize = scan.nextInt();
        List<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i < numSize; i++) {
            array.add(scan.nextInt());
        }
        int numOfAnswer = 0;

        for(int i = 0; i < numSize - 2; i ++) {
            if(array.get(i) < array.get(i + 1) && array.get(i + 1) < array.get(i + 2) || array.get(i) > array.get(i + 1) && array.get(i + 1) > array.get(i + 2)) {
                numOfAnswer++;
            }
        }
        os.println(numOfAnswer);
    }
}