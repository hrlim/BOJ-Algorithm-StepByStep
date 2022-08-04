package com.acmicpc.algorithm.P16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 알고리즘 수업 - 피보나치 수 1
 */
public class Q24416 {
    static int fibCnt = 0;
    static int fibonacciCnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        fib(N);
        System.out.println(fibCnt);

        fibonacci(N);
        System.out.println(fibonacciCnt);
    }

    static int fib(int n) {

        if (n < 3) {
            fibCnt++;
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    static int fibonacci(int n) {
        int[] arr = new int[n + 1];
        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i <= n; i++) {
            fibonacciCnt++;
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return  arr[n];
    }
}
