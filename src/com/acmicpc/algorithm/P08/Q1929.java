package com.acmicpc.algorithm.P08;

import java.util.Scanner;

/**
 * 소수 구하기
 */
public class Q1929 {
    public static boolean[] prime;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();

        prime = new boolean[N + 1];
        getPrime();

        for (int i = M; i <= N; i++) {
            // false = 소수
            if (!prime[i]) System.out.println(i);
        }
    }


    // 에라토스테네스의 체 알고리즘
    public static void getPrime() {
        // true = 소수아님 , false = 소수
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
