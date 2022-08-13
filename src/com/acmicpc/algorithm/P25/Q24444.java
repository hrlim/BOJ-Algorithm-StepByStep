package com.acmicpc.algorithm.P25;

import java.io.*;
import java.util.*;

/**
 * 알고리즘 수업 - 너비 우선 탐색 1
 */
public class Q24444 {
    static ArrayList<Integer> map[];
    static int[] visitOrders;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = stringToInt(st.nextToken());
        int M = stringToInt(st.nextToken());
        int R = stringToInt(st.nextToken());

        map = new ArrayList[N + 1];
        visitOrders = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            map[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = stringToInt(st.nextToken());
            int end = stringToInt(st.nextToken());
            map[start].add(end);
            map[end].add(start);
        }

        for (int i = 1; i < map.length; i++) {
            Collections.sort(map[i]);
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
        int cnt = 1;

        queue.offer(start);
        visitOrders[start] = cnt++;

        while (!queue.isEmpty()) {
            int tmp = queue.poll();
            for (Integer pos : map[tmp]) {
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
