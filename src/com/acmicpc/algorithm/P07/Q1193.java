package com.acmicpc.algorithm.P07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 분수찾기
 */
public class Q1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        if (N == 1) {
            System.out.println("1/1");
            System.exit(0);
        }

        int sum = 1;
        int T = 2;
        while (true) {
            if (sum >= N) {
                break;
            }
            sum += T++;
        }

        int preSum = sum - (T - 1);
        if (T % 2 == 0) {
            System.out.println((T - (N - preSum)) + "/" + (N - preSum));
        } else {
            System.out.println((N - preSum) + "/" + (T - (N - preSum)));
        }

    }
}
