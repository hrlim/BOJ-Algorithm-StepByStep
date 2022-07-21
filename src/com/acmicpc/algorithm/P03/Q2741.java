package com.acmicpc.algorithm.P03;

import java.io.*;

/**
 * N 찍기
 */
public class Q2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            sb.append(i).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
