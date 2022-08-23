package com.acmicpc.algorithm.P25;

import java.io.*;
import java.util.*;

/**
 * DFS 와 BFS
 */
public class Q1260 {

    static ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
    static boolean[] isVisited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = stringToInt(st.nextToken());
        int M = stringToInt(st.nextToken());
        int V = stringToInt(st.nextToken());

        isVisited = new boolean[N + 1];

        for(int i = 0; i <= N; i++){
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = stringToInt(st.nextToken());
            int end = stringToInt(st.nextToken());
            adjList.get(start).add(end);
            adjList.get(end).add(start);
        }

        for (int i = 1; i < adjList.size(); i++) {
            Collections.sort(adjList.get(i));
        }

        dfs(V);
        sb.append("\n");

        Arrays.fill(isVisited, false);
        bfs(V);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int start) {
        isVisited[start] = true;
        sb.append(start).append(" ");
        for (Integer pos : adjList.get(start)) {
            if (isVisited[pos]) continue;
                dfs(pos);
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        isVisited[start] = true;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            sb.append(cur).append(" ");

            for (Integer pos : adjList.get(cur)) {
                if (isVisited[pos]) continue;
                isVisited[pos] = true;
                queue.add(pos);
            }
        }
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
