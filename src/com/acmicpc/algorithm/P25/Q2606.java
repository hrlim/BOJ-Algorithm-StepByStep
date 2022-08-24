package com.acmicpc.algorithm.P25;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 바이러스 - 실버 3
 * 너비우선탐색, 그래프
 */


public class Q2606 {

    static int N, M;

    static class Node {
        int to;
        Node next;

        public Node(int to, Node next) {
            this.to = to;
            this.next = next;
        }
    }

    static Node[] adjList;

    // 상하좌우
    static int[][] dirs4 = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        N = stringToInt(br.readLine());
        M = stringToInt(br.readLine());
        adjList = new Node[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = stringToInt(st.nextToken());
            int to = stringToInt(st.nextToken());

            adjList[from] = new Node(to, adjList[from]);
            adjList[to] = new Node(from, adjList[to]);
        }

        System.out.println(bfs(1));
    }

    static int bfs(int startNode) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startNode);

        boolean[] isVisited = new boolean[N + 1];
        isVisited[startNode] = true;

        int count = 0; // 바이러스에 감염된 컴퓨터 갯수
        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (Node node = adjList[cur]; node != null; node = node.next) {

                if (isVisited[node.to]) continue;
                isVisited[node.to] = true;
                queue.offer(node.to);
                count++;
            }
        }
        return count;
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
