package com.acmicpc.algorithm.P15;

import java.io.*;

/**
 * N-Queen
 */
public class Q9663 {
    public static int totalCnt;

    public static int N;
    public static int[] selected;  // selected 의 인덱스는 col  를 의미, 값은 row 를 의미

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = stringToInt(br.readLine());
        selected = new int[N];

        nQueen(0);
        System.out.println(totalCnt);

    }

    public static void nQueen(int depth) {
        if (depth == N) {
            totalCnt++;
            return;
        }

        // selected 의 인덱스는 col  를 의미, 값은 row 를 의미
        for (int i = 0; i < N; i++) {
            selected[depth] = i;
            // 놓을 수 있는 위치일 경우 재귀호출
            if (isPossible(depth)) {
                nQueen(depth + 1);
            }
        }

    }

    public static boolean isPossible(int col) {

        for (int i = 0; i < col; i++) {
            /**
             *  해당 열의 행과 i열의 행이 일치할경우 (같은 행에 존재할 경우)
             */

            if (selected[col] == selected[i]) {
                return false;
            }

            /**
             * 대각선상에 놓여있는 경우
             * (열의 차와 행의 차가 같을 경우가 대각선에 놓여있는 경우다)
             */
            else if (Math.abs(col - i) == Math.abs(selected[col] - selected[i])) {
                return false;
            }
        }

        return true;
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
