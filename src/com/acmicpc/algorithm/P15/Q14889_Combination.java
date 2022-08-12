package com.acmicpc.algorithm.P15;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 스타트와 링크
 */
public class Q14889_Combination {

    private static int[][] map;
    private static boolean[] selected;
    private static int minDiff = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int N = stringToInt(br.readLine());

        map = new int[N][N];
        selected = new boolean[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = stringToInt(st.nextToken());
            }
        }

        combination(0, 0);
        System.out.println(minDiff);
    }

    private static void combination(int cnt, int start) {
        if (cnt == map.length / 2) {
            int powerA = 0, powerB = 0;
            for (int i = 0; i < selected.length; i++) {
                // A 팀의 결과
                for (int j = 0; j < selected.length; j++) {
                    if (selected[i] && selected[j]) {
                        powerA += map[i][j];
                    }
                }
                // B 팀의 결과
                for (int j = 0; j < selected.length; j++) {
                    if (!selected[i] && !selected[j]) {
                        powerB += map[i][j];
                    }
                }
            }
            minDiff = Math.min(minDiff, Math.abs(powerA - powerB));
            return;
        }
        for (int i = start; i < selected.length; i++) {
            selected[i] = true;
            combination(cnt + 1, i + 1);
            selected[i] = false;
        }

    }

    private static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
