package com.acmicpc.algorithm.P30;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 사이클 게임
 */
public class Q20040 {
    static int[] parents;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = stringToInt(st.nextToken());
        M = stringToInt(st.nextToken());

        parents = new int[N];
        makeSet();

        int answer = 0;
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = stringToInt(st.nextToken());
            int to = stringToInt(st.nextToken());
            if(!union(from, to) && answer == 0){
                answer = i;
            }
        }
        sb.append(answer);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static void makeSet() {
        for (int i = 0; i < N; i++) {
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
