package com.acmicpc.algorithm.P08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 소수 찾기
 */
public class Q1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int primeCnt = 0;
        for (int i = 0; i < T; i++) {
            int value = Integer.parseInt(st.nextToken());
            if (value == 1) {
                continue;
            } else {
                boolean isPrime = true;
                for (int j = 2; j < value; j++) {
                    if (value % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primeCnt++;
                }
            }
        }
        System.out.println(primeCnt);
    }
}
