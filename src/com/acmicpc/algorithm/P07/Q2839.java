package com.acmicpc.algorithm.P07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 설탕 배달
 */
public class Q2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        boolean isOk = false;
        int weight = N;
        int cnt = 0;
        for (int i = N / 5; i >= 0; i--) {
            cnt += i;
            weight -= 5 * i;

            if (weight % 3 == 0) {
                cnt += (weight / 3);
                isOk = true;
                break;
            }
            cnt = 0;
            weight = N;
        }

        if (!isOk) {
            if (weight % 3 == 0) {
                cnt = weight / 3;
            } else {
                cnt = -1;
            }
        }

        System.out.println(cnt);
    }
}
