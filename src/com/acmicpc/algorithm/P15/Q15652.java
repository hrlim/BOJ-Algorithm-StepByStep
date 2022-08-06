package com.acmicpc.algorithm.P15;

import java.io.*;
import java.util.StringTokenizer;

/**
 * N 과 M ( 4 )
 */
public class Q15652 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = stringToInt(st.nextToken());
        int M = stringToInt(st.nextToken());

        comb(N, new int[M], 0, 1);

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    static void comb(int N, int[] output, int depth, int start) {
        if (depth == output.length) {
            for (int i = 0; i < output.length; i++) {
                sb.append(output[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = start; i <= N; i++) {
            output[depth] = i;
            comb(N, output, depth + 1, i);
        }
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
