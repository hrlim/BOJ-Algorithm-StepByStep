package com.acmicpc.algorithm.P04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 숫자의 개수
 */
public class Q2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.valueOf(br.readLine());
        int B = Integer.valueOf(br.readLine());
        int C =Integer.valueOf(br.readLine());

        int multiple = A * B * C;

        String temp = String.valueOf(multiple);

        int[] count = new int[10];

        for (int i = 0; i < temp.length(); i++) {
            count[temp.charAt(i)  - '0'] ++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    }
}
