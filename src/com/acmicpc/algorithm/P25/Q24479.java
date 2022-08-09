package com.acmicpc.algorithm.P25;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * 알고리즘 수업 - 깊이 우선 탐색 1
 */
public class Q24479 {

    static ArrayList<Integer> map[];
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

        map = new ArrayList[N + 1];
        isVisited = new int[N + 1];

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

        dfs(R);
        for (int i = 1; i <=N ; i++) {
            bw.write(isVisited[i] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int start) {

        isVisited[start] = dfsCount++;
        for (Integer pos : map[start]) {
            if(isVisited[pos] != 0)
                continue;
            dfs(pos);
        }
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
