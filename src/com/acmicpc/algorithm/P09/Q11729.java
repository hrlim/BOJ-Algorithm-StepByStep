package com.acmicpc.algorithm.P09;

import java.util.Scanner;

/**
 * 하노이 탑 이동 순서
 */
public class Q11729 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        hanoi(N, 1, 2, 3);

        System.out.println(res);
        System.out.println(sb.toString());
    }

    static int res = 0;
    static StringBuilder sb = new StringBuilder();
    /**
     * @param N         하노이탑 높이
     * @param start     시작 기둥
     * @param temp      임시 기둥
     * @param end       목적 기둥
     */
    static void hanoi(int N, int start, int temp, int end) {
        if (N == 0) return;
        // N -1 판 임시 기둥으로 옮기기
        hanoi(N - 1, start, end, temp);

        // N 이동
        res += 1;
        sb.append(start + " " + end + "\n");

        // N -1 판 목적 기둥으로 옮기기
        hanoi(N - 1, temp, start, end);
    }
}
