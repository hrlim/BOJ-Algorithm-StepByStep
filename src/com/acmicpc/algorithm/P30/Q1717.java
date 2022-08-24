package com.acmicpc.algorithm.P30;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 집합의 표현
 */
public class Q1717 {
    static int[] parents;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = stringToInt(st.nextToken());
        int M = stringToInt(st.nextToken());

        parents = new int[N + 1];
        makeSet();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int command = stringToInt(st.nextToken());
            int from = stringToInt(st.nextToken());
            int to = stringToInt(st.nextToken());

            if(command == 0) union(from, to);
            else sb.append(findSet(from) == findSet(to) ? "YES" : "NO").append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static void makeSet() {
        for (int i = 0; i <= N; i++) {
            parents[i] = i;
        }
    }

    static int findSet(int num){
        if(parents[num] == num) return num;
        return parents[num] = findSet(parents[num]);
    }

    static boolean union(int num1, int num2){
        int rep1 = findSet(num1);
        int rep2 = findSet(num2);
        if(rep1 == rep2) return false;
        parents[rep2] = rep1;
        return true;
    }
    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
