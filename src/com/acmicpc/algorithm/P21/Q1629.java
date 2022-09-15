package com.acmicpc.algorithm.P21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 곱셈 - 실버 1
 */
public class Q1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = stringToInt(st.nextToken());
        int B = stringToInt(st.nextToken());
        int C = stringToInt(st.nextToken());

        System.out.println(pow(A, B, C));
    }

    static long pow(int a, int b, int mod) {
        if (b == 0)
            return 1;

        long n = pow(a, b / 2, mod);
        if (b % 2 == 0)
            return n * n % mod;
        else
            return (n * n % mod) * a % mod;
    }

    static int stringToInt(String s){
        return Integer.parseInt(s);
    }
}
