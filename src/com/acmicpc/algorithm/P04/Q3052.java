package com.acmicpc.algorithm.P04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 나머지
 */
public class Q3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] count = new int[42];

        for (int i = 0; i < 10; i++) {
            int result = Integer.parseInt(br.readLine()) % 42;
            count[result]++;
        }

        int noZeroCount = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                noZeroCount++;
            }
        }

        System.out.println(noZeroCount);
    }
}
