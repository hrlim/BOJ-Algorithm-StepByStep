package com.acmicpc.algorithm.P04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 최댓값
 */
public class Q2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.valueOf(br.readLine());
        }

        int max = Integer.MIN_VALUE;
        int maxPosition = -1;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
                maxPosition = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(maxPosition);
    }
}
