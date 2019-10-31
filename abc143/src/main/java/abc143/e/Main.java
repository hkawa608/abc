package abc143.e;

import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int M = scan.nextInt();
        long L = scan.nextLong();
        ArrayList<Node> nodeList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            nodeList.add(new Node());
        }
        for (int i = 0; i < M; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            long c = scan.nextLong();
            nodeList.get(a).edges.put(b, c);
            nodeList.get(b).edges.put(a, c);
        }

        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            int start = scan.nextInt();
            int end = scan.nextInt();

            for (Node node : nodeList) {
                node.cost = -1;
                node.done = false;
            }

            nodeList.get(start).cost = 0;



        }
    }

    private static class Node {
        // このノードから伸びるエッジの情報
        HashMap edges = new HashMap<Integer, Long>();
//        int edges_to;    // 各エッジの接続先のノード番号
//        int edges_cost;  // 各エッジのコスト

        // ダイクストラ法のためのデータ
        boolean done = false;  // 確定ノードか否か
        int cost = -1;   // このノードへの現時点で判明している最小コスト
    }
}
