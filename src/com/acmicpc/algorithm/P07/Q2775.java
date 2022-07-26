package com.acmicpc.algorithm.P07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 부녀회장이 될테야
 */
public class Q2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(br.readLine());

        for (int i = 0; i < T; i++) {
            int K = Integer.valueOf(br.readLine());
            int N = Integer.valueOf(br.readLine());

            int[][] map = new int[K + 1][N];
            for (int j = 0; j < N; j++) {
                map[0][j] = j + 1;
            }

            for (int j = 0; j < K + 1; j++) {
                map[j][0] = 1;
            }

            for (int nr = 1; nr < K + 1; nr++) {
                for (int nc = 1; nc < N; nc++) {
                    map[nr][nc] = map[nr - 1][nc] + map[nr][nc - 1];
                }
            }
            System.out.println(map[K][N - 1]);
        }
    }
}
