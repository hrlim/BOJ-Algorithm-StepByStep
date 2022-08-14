package com.acmicpc.algorithm.P10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 체스판 다시 칠하기
 */
public class Q1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = stringToInt(st.nextToken());
        int M = stringToInt(st.nextToken());

        boolean[][] map = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {
                if (input.charAt(j) == 'W') {
                    map[i][j] = true;		// W일 때는 true
                } else {
                    map[i][j] = false;		// B일 때는 false
                }
            }
        }

        int result = Integer.MAX_VALUE;
        for (int i = 7; i < N; i++) {
            for (int j = 7; j < M; j++) {
                result = Math.min(result, checkChessBoard(map, i, j));
            }
        }
        System.out.println(result);
    }

    /**
     * 체스판 검사를 시작할 좌표를 입력받아
     * 시작좌표가 블랙으로 시작할 경우와 화이트로 시작할 경우 중
     * 바꿔 칠해야 하는 체스판의 최소값을 반환한다.
     *
     * @param arr 맵정보
     * @param x   좌표 X
     * @param y   좌표 Y
     * @return
     */
    private static int checkChessBoard(boolean[][] arr, int x, int y) {
        // 시작좌표가 블랙인 경우, 화이트인 경우의 최소값 저장
        int[] result = new int[2];
        // 화이트인 경우는 true, 블랙인 경우는 false
        boolean[] blackWhite = new boolean[]{true, false};

        for (int color = 0; color < blackWhite.length; color++) {
            boolean chessColor = blackWhite[color];
            int count = 0;
            for (int i = x - 7; i <= x; i++) {
                for (int j = y - 7; j <= y; j++) {
                    if (chessColor == arr[i][j]) {
                        count++;
                    }
                    chessColor = !(chessColor);
                }
                chessColor = !(chessColor);
            }
            result[color] = count;
        }

        return Math.min(result[0], result[1]);
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
