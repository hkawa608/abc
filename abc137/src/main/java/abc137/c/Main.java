package abc137.c;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        Integer N = scan.nextInt();
        long count = 0;
        HashMap<String, Long> map = new HashMap<String, Long>();
        for(int i = 0; i < N; i++) {
            String s = scan.next();
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            String sorted = new String(sArray);
            if(map.containsKey(sorted))
                map.put(sorted, map.get(sorted) + 1);
            else
                map.put(sorted, (long)1);
        }
        for(Entry<String, Long> entry : map.entrySet()) {
            long value = entry.getValue();
            count += value * (value - 1) / 2;
        }
        os.println(count);

    }
}