package com.acmicpc.algorithm.P17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 수열
 */
public class Q2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = stringToInt(st.nextToken());
        int K = stringToInt(st.nextToken());

        int[] arr = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
           arr[i] = arr[i - 1] + stringToInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;
        for (int i = K; i <= N; i++) {
            int sum = arr[i] - arr [i - K];
            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }

    static int stringToInt(String s){
        return Integer.parseInt(s);
    }
}

