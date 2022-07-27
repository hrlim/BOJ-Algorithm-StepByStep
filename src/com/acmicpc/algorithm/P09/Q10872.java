package com.acmicpc.algorithm.P09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 팩토리얼
 */
public class Q10872 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        System.out.println(factorial(N));
    }

    public static int factorial(int N) {
        if(N <= 1)
            return 1;
        return N * factorial(N - 1);
    }
}
