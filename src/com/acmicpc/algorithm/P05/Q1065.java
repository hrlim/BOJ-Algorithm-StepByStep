package com.acmicpc.algorithm.P05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 한수
 */
public class Q1065 {
    public static void main(String[] args) throws IOException {    // 메인

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(d(N));
    }

    public static int d(int number) {
        int result = 0;
        if (number < 100) {
            return number;
        } else {
            result = 99;
            for (int i = 100; i <= number; i++) {
                int hundred = i / 100;      // 백의 자리
                int ten = (i / 10) % 10;    // 십의 자리
                int one = i % 10;           //일의 자리

                if ((hundred - ten) == (ten - one)) {
                    result++;
                }
            }
        }
        return result;
    }
}
