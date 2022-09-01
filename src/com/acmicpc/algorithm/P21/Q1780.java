package com.acmicpc.algorithm.P21;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 종이의 개수 - 실버 2
 * 분할정복, 재귀
 */
public class Q1780 {

    static int N;
    static int[][] map;
    static int[] count; // 인덱스보다 값이 -1 적은 종이의 갯수를 저장하는 변수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        N = stringToInt(br.readLine());
        map = new int[N][N];
        count = new int[3];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = stringToInt(st.nextToken());
            }
        }
        divideConquer(N, 0, 0);
        for (int i = 0; i < count.length; i++) {
            sb.append(count[i] + "\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    /**
     * 종이를 분할 및 확인을 재귀적으로 수행하는 메서드
     *
     * @param size
     * @param row
     * @param col
     */
    static void divideConquer(int size, int row, int col) {
        if(size == 1) {
            count[map[row][col] + 1]++;
            return;
        }
        if (isPaper(size, row, col)) return;

        int triple = size / 3;
        divideConquer(triple, row, col);
        divideConquer(triple, row + triple, col);
        divideConquer(triple, row + triple * 2, col);
        divideConquer(triple, row, col + triple);
        divideConquer(triple, row, col + triple * 2);
        divideConquer(triple, row + triple, col + triple);
        divideConquer(triple, row + triple * 2, col + triple);
        divideConquer(triple, row + triple, col + triple * 2);
        divideConquer(triple, row + triple * 2, col + triple * 2);
    }

    /**
     * 종이인지 확인하는 메서드
     * @param size
     * @param row
     * @param col
     * @return
     */
    static boolean isPaper(int size, int row, int col) {
        int temp = map[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (map[i][j] != temp) return false;
            }
        }
        count[temp + 1]++;
        return true;
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
