package com.acmicpc.algorithm.P16;

import java.io.*;

/**
 * 파도반 수열
 */
public class Q9461 {

    static long[] memo = new long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        memo[1] = 1;
        memo[2] = 1;
        memo[3] = 1;

        for (int i = 4; i <= 100; i++) {
            memo[i] = memo[i - 2] + memo[i - 3];
        }

        int T = stringToInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            sb.append(memo[stringToInt(br.readLine())]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }

}
