package com.acmicpc.algorithm.P25;

import java.io.*;
import java.util.*;

/**
 * DFS 와 BFS
 */
public class Q1260 {

    static ArrayList<ArrayList<Integer>> map = new ArrayList<>();
    static int[] isVisited;

    static int dfsCount = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = stringToInt(st.nextToken());
        int M = stringToInt(st.nextToken());
        int R = stringToInt(st.nextToken());

        isVisited = new int[N + 1];

        for(int i = 0; i <= N; i++){
            map.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = stringToInt(st.nextToken());
            int end = stringToInt(st.nextToken());
            map.get(start).add(end);
            map.get(end).add(start);
        }

        for (int i = 1; i < map.size(); i++) {
            Collections.sort(map.get(i));
        }

        dfs(R);
        for (int i = 1; i <= N; i++) {
            bw.write(isVisited[i] + " ");
        }
        bw.write("\n");

        Arrays.fill(isVisited, 0);
        bfs(R);

        for (int i = 1; i <= N; i++) {
            bw.write(isVisited[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int start) {
        isVisited[start] = dfsCount++;
        for (Integer pos : map.get(start)) {
            if (isVisited[pos] == 0)
                dfs(pos);
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        int cnt = 1;
        isVisited[start] = cnt;
        while (!queue.isEmpty()) {
            int tmp = queue.poll();
            for (Integer pos : map.get(tmp)) {
                if (isVisited[pos] != 0) continue;
                isVisited[pos] = ++cnt;
                queue.add(pos);
            }
        }
    }


    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
