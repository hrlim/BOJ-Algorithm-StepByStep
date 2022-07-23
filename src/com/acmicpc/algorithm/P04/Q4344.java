package com.acmicpc.algorithm.P04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 평균은 넘겠지
 */
public class Q4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            int sum = 0;
            int[] arr = new int[N];

            for (int j = 0; j < N; j++) {
                arr[j] = Integer.valueOf(st.nextToken());
                sum += arr[j];
            }
            double avg = sum / N;
            double cnt = 0;

            for (int j = 0; j < N; j++) {
                if (avg < arr[j]) {
                    cnt++;
                }
            }

            System.out.printf("%.3f%%\n", (cnt / N) * 100);
        }
    }
}
