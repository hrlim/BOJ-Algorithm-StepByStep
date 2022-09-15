package com.acmicpc.algorithm.P30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 여행 가자 - 골드 4
 */
public class Q1976 {

    static void makeSet() {
        for (int i = 0; i < N; i++) {
            parents[i] = i;
        }
    }

    static int findSet(int num) {
        if (parents[num] == num) return num;
        return parents[num] = findSet(parents[num]);
    }

    static boolean union(int num1, int num2) {
        int rep1 = findSet(num1);
        int rep2 = findSet(num2);
        if (rep1 == rep2) return false;
        parents[rep2] = rep1;
        return true;
    }

    public static int N, M;
    public static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        N = stringToInt(br.readLine());
        M = stringToInt(br.readLine());

        parents = new int[N];
        makeSet();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                if (stringToInt(st.nextToken()) == 1) union(i, j);
            }
        }

        int[] trip = new int[M];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            trip[i] = stringToInt(st.nextToken()) - 1;
        }

        for (int i = 1; i < M; i++) {
            if (findSet(trip[i - 1]) != findSet(trip[i])) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

    public static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
