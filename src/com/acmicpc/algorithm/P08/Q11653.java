package com.acmicpc.algorithm.P08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 소인수분해
 */
public class Q11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());

        if (N == 1) {
            return;
        }

        int divide = 2;
        while (N != 1) {
            if (N % divide == 0) {
                N /= divide;
                System.out.println(divide);
                divide = 2;
            } else {
                divide++;
            }
        }
    }
}
