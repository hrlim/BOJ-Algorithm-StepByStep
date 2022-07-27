package com.acmicpc.algorithm.P08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 소수
 */
public class Q2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.valueOf(br.readLine());
        int N = Integer.valueOf(br.readLine());

        int sum = 0;
        int min = Integer.MAX_VALUE;

        if(M == 1 && N == 1){
            System.out.println("-1");
            return;
        }

        if(M == 1){
            M = 2;
        }

        for (int i = M; i <= N; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                if (min > i) {
                    min = i;
                }
            }
        }
        if (sum != 0) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println("-1");
        }
    }
}
