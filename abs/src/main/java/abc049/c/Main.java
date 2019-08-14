package abc049.c;

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
        String S = scan.next();
        int charPosition = 0;
        int length = S.length();

        while(true) {
            if (charPosition == length) {
                os.println("YES");
                return;
            }

            String subString;
            if(charPosition + 5 <= length)
                subString = S.substring(charPosition, charPosition + 5);
            else
                subString = "";

            if (subString.equals("dream")) {
                if(charPosition + 11 <= length && S.substring(charPosition, charPosition + 11).equals("dreameraser")) {
                    charPosition += 11;
                    continue;
                }
                if(charPosition + 10 <= length && S.substring(charPosition, charPosition + 10).equals("dreamerase")) {
                    charPosition += 10;
                    continue;
                }
                if(charPosition + 7 <= length && S.substring(charPosition, charPosition + 7).equals("dreamer")) {
                    charPosition += 7;
                    continue;
                }
                charPosition += 5;
            } else if (subString.equals("erase")) {
                if(charPosition + 6 <= length && S.substring(charPosition, charPosition + 6).equals("eraser")) {
                    charPosition += 6;
                    continue;
                }
                charPosition += 5;
            } else {
                os.println("NO");
                return;
            }
        }

    }
}