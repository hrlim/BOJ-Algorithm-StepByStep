package com.acmicpc.algorithm.P25;

import java.io.*;
import java.util.*;

/**
 * 알고리즘 수업 - 너비 우선 탐색 1
 */
public class Q24444 {
    static ArrayList<Integer> adjList[];
    static int[] visitOrders;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = stringToInt(st.nextToken());
        int M = stringToInt(st.nextToken());
        int R = stringToInt(st.nextToken());

        adjList = new ArrayList[N + 1];
        visitOrders = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = stringToInt(st.nextToken());
            int end = stringToInt(st.nextToken());
            adjList[start].add(end);
            adjList[end].add(start);
        }

        for (int i = 1; i < adjList.length; i++) {
            Collections.sort(adjList[i]);
        }

        bfs(R);
        for (int i = 1; i <= N; i++) {
            bw.write(visitOrders[i] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        int cnt = 1;
        visitOrders[start] = cnt++;

        while (!queue.isEmpty()) {
            int tmp = queue.poll();
            for (Integer pos : adjList[tmp]) {
                if(visitOrders[pos] != 0) continue;

                queue.offer(pos);
                visitOrders[pos] = cnt++;
            }
        }
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
