package com.acmicpc.algorithm.P09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 피보나치 수 5
 */
public class Q10870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        System.out.println(fib(N));
    }

    public static int fib(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;

        return fib(N - 1) + fib(N - 2);
    }
}
