package com.acmicpc.algorithm.P10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 분해합
 */
public class Q2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int constructor = 0;

        for (int i = 1; i <= N; i++) {
            int sum = i;
            int copy = i;
            String temp = String.valueOf(i);
            for (int j = 0; j < temp.length(); j++) {
                sum += copy % 10;
                copy /= 10;
            }
            if(sum == N){
                constructor = i;
                break;
            }
        }
        System.out.println(constructor);
    }
}
