package com.acmicpc.algorithm.P04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 평균
 */
public class Q1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        double[] arr = new double[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        double max = 0.0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            sum += arr[i];
        }

        System.out.println(((sum / max) * 100) / N);
    }
}
