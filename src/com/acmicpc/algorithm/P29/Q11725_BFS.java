package com.acmicpc.algorithm.P29;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 트리의 부모 찾기
 * DFS : 652 ms / 51176 KB
 * BFS : 436 ms / 51392 KB
 */
public class Q11725_BFS {
    static class Node {
        int to;
        Node next;

        public Node(int to, Node next) {
            this.to = to;
            this.next = next;
        }
    }

    static Node[] adjList;
    static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;

        int N = stringToInt(br.readLine());
        adjList = new Node[N + 1];
        parents = new int[N + 1];

        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int from = stringToInt(st.nextToken());
            int to = stringToInt(st.nextToken());

            adjList[from] = new Node(to, adjList[from]);
            adjList[to] = new Node(from, adjList[to]);
        }

        bfs(1);

        for (int i = 2; i < parents.length; i++) {
            sb.append(parents[i]).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        parents[start] = start;

        while (!queue.isEmpty()) {
            int parent = queue.poll();
            for (Node node = adjList[parent]; node != null; node = node.next) {
                if (parents[node.to] == 0) {
                    parents[node.to] = parent;
                    queue.offer(node.to);
                }
            }
        }
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
