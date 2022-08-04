package com.acmicpc.algorithm.P16;

import java.io.*;

/**
 * 01타일
 */
public class Q1904 {

    static int[] dp = new int[1_000_001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        sb.append(fib(stringToInt(br.readLine())));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static int fib(int N) {
       if(dp[N] != 0){
           return dp[N];
       }

       for (int i = 3; i <= N; i++) {
           dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
        }

       return dp[N];
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }

}
