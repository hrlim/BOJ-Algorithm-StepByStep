package com.acmicpc.algorithm.P16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 연속합
 */
public class Q1912 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] memo = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = stringToInt(st.nextToken());
        }

        memo[0] = arr[0];

        for (int i = 1; i < N; i++) {
            memo[i] = Math.max(arr[i], arr[i] + memo[i - 1]);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if(memo[i] > max){
                max = memo[i];
            }
        }
        System.out.println(max);
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }

}
