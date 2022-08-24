package com.acmicpc.algorithm.P29;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 트리의 지름
 */
public class Q1167 {

    static class Node {
        int to;
        int weight;
        Node next;

        public Node(int to, int weight, Node next) {
            this.to = to;
            this.weight = weight;
            this.next = next;
        }
    }

    static Node[] adjList;
    static int V;
    static int maxDiameter = Integer.MIN_VALUE;
    static int maxDepthNode = -1;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        V = stringToInt(br.readLine());
        adjList = new Node[V + 1];

        for (int test_case = 1; test_case <= V; test_case++) {
            st = new StringTokenizer(br.readLine());
            int fromIndex = stringToInt(st.nextToken());
            int count = st.countTokens();
            for (int i = 0; i < count / 2; i++) {
                int toIndex = stringToInt(st.nextToken());
                int weight = stringToInt(st.nextToken());
                adjList[fromIndex] = new Node(toIndex, weight, adjList[fromIndex]);
            }
        }
        dfs(1, new boolean[V + 1], 0);
        dfs(maxDepthNode, new boolean[V + 1], 0);
        System.out.println(maxDiameter);
    }

    static void dfs(int start, boolean[] isSelected, int sumDiameter) {
        isSelected[start] = true;
        for (Node node = adjList[start]; node != null; node = node.next) {
            if (isSelected[node.to]) continue;
            isSelected[node.to] = true;
            dfs(node.to, isSelected, sumDiameter + node.weight);
        }
        if (maxDiameter < sumDiameter) {
            maxDiameter = sumDiameter;
            maxDepthNode = start;
        }
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
