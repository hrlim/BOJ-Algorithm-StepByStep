package com.acmicpc.algorithm.P06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 숫자의 합
 */
public class Q11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        String digit = br.readLine();
        String[] digits = digit.split("");
        for (int i = 0; i < N; i++) {
            sum += Integer.valueOf(digits[i]);
        }
        System.out.println(sum);
    }
}
