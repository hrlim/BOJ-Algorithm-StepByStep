package com.acmicpc.algorithm.P03;

import java.io.*;

/**
 * 별 찍기 - 2
 */
public class Q2439 {
    public static final String NEW_LINE = System.lineSeparator();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        /*
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N - i ; j++) {
                    sb.append(" ");
                }
                for (int j = N - i; j < N; j++) {
                    sb.append("*");
                }
                sb.append(NEW_LINE);
            }
        */

        for (int i = 1; i <= N; i++) {
            for (int j = N; j > i; j--) {
                sb.append(" ");
            }
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append(NEW_LINE);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
